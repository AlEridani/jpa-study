package com.example.demo.runner;

import com.example.demo.entity.Dummy;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.DummyRepository;
import com.example.demo.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class CacheTestRunner implements CommandLineRunner {
    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;
    private final CategoryRepository categoryRepository;
    private final DummyRepository dummyRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {


    }



}



