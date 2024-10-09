package hellojpa;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {



//            //Locker 엔티티 생성
//            Locker locker = new Locker();
//            em.persist(locker);
//            locker.setName(locker.getId() + "번 락커");
//
//            //Member 엔티티 생성
//            Member member = new Member();
//            member.setName("홍길동");
//            member.setAge(20);
//            member.setLocker(locker);
//            em.persist(member);






//            //Team 엔티티 생성
//            Team team = new Team();
//            team.setName("경영팀");
//            team.getMembers().add(member);
//            em.persist(team);





//            member.setTeam(team);
//
//            Member member2 = new Member();
//            member2.setName("김길동");
//            member2.setTeam(team);
//            member2.setAge(30);
//
//            Member member3 = new Member();
//            member3.setName("이길동");
//            member3.setTeam(team);
//            member3.setAge(40);
//
//            Locker locker = new Locker();
//            locker.setMember(member);
//            em.persist(locker);


//            em.persist(member2);
//            em.persist(member3);
//
//            //Item 엔티티 생성 및 조회
//            Item item = new Item();
//            item.setName("삼겹살");
//            item.setPrice(20000);
//            item.setStock(50);
//            System.out.println("=====em.persist(item) before====");
//            em.persist(item);
//            System.out.println("=====em.persist(item) after====");
//
//            Long memberId = member.getId();
//            //clear시 프록시 객체 생성
////            em.clear();
//            System.out.println("=====em.getReference(Member.class, memberId) before====");
//            Member findMember = em.getReference(Member.class, 1L);
//            Member findMember2 = em.getReference(Member.class, memberId);
//
//            System.out.println("=====em.getReference(Member.class, memberId) after====");
//
//            // 프록시 객체의 클래스 출력
//            System.out.println("===================");
//            System.out.println("findMember.getClass() = " + findMember.getClass());
//            System.out.println("findMember2.getClass() = " + findMember2.getClass());
//            System.out.println("===================");

            // 프록시 객체의 실제 데이터를 접근하여 초기화
//            String memberName = findMember.getName();
//            System.out.println("memberName : " + memberName);
//            String teamName = findMember.getTeam().getName();
//            System.out.println("teamName : " + teamName);




            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        em.close();
        emf.close();
    }
}
