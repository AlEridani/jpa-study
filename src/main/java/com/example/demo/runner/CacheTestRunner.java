package com.example.demo.runner;

import com.example.demo.entity.Board;
import com.example.demo.entity.Category;
import com.example.demo.entity.Member;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
@RequiredArgsConstructor
public class CacheTestRunner implements CommandLineRunner {
    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        // 카테고리 생성
        Category tech = new Category();
        tech.setName("Technology");

        Category life = new Category();
        life.setName("Lifestyle");

        categoryRepository.save(tech);
        categoryRepository.save(life);

        // 작성자 생성
        Member author = new Member();
        author.setName("John Doe");

        // 게시물 생성
        Board board1 = new Board();
        board1.setTitle("Spring Boot Guide");
        board1.setContent("Content of Spring Boot Guide");
        board1.setMember(author);
        board1.getCategories().add(tech); // categories가 초기화됨

        Board board2 = new Board();
        board2.setTitle("Healthy Living");
        board2.setContent("Content of Healthy Living");
        board2.setMember(author);
        board2.getCategories().add(life); // categories가 초기화됨

        // 관계 설정
        author.getBoards().add(board1);
        author.getBoards().add(board2);

        // 엔티티 저장
        memberRepository.save(author);
        boardRepository.save(board1);
        boardRepository.save(board2);

        // 캐시 확인을 위한 데이터 조회
        System.out.println("===== 첫 번째 조회 =====");
        Member fetchedAuthor1 = memberRepository.findById(author.getId()).orElse(null);
        if (fetchedAuthor1 != null) {
            System.out.println("Author: " + fetchedAuthor1.getName());
            fetchedAuthor1.getBoards().forEach(board -> {
                System.out.println("Board: " + board.getTitle());
                board.getCategories().forEach(category -> System.out.println("Category: " + category.getName()));
            });
        }

        System.out.println("===== 두 번째 조회 =====");
        Member fetchedAuthor2 = memberRepository.findById(author.getId()).orElse(null);
        if (fetchedAuthor2 != null) {
            System.out.println("Author: " + fetchedAuthor2.getName());
            fetchedAuthor2.getBoards().forEach(board -> {
                System.out.println("Board: " + board.getTitle());
                board.getCategories().forEach(category -> System.out.println("Category: " + category.getName()));
            });
        }

        // 캐시 무효화 확인을 위한 데이터 업데이트
        System.out.println("===== 데이터 업데이트 =====");
        if (fetchedAuthor2 != null) {
            fetchedAuthor2.setName("Jane Doe");
            memberRepository.save(fetchedAuthor2);
        }

        System.out.println("===== 세 번째 조회 (업데이트 후) =====");
        Member fetchedAuthor3 = memberRepository.findById(author.getId()).orElse(null);
        if (fetchedAuthor3 != null) {
            System.out.println("Author: " + fetchedAuthor3.getName());
            fetchedAuthor3.getBoards().forEach(board -> {
                System.out.println("Board: " + board.getTitle());
                board.getCategories().forEach(category -> System.out.println("Category: " + category.getName()));
            });
        }
    }
}
