package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

            Team team = new Team();
            team.setName("경영팀");
            em.persist(team);

            Member member = new Member();
            member.setName("홍길동");
            member.setTeam(team);
            Member member2 = new Member();
            member2.setName("김길동");
            member2.setTeam(team);

            Member member3 = new Member();
            member3.setName("이길동");
            member3.setTeam(team);


            Item item = new Item();
            item.setName("삼겹살");
            item.setPrice(20000);
            item.setStock(50);

            em.persist(item);
            em.persist(member);
            em.persist(member2);
            em.persist(member3);
//            Long memberId = member.getId();
//            Member findMember = em.find(Member.class, memberId);
//            System.out.println("=====em.persist(member) before====");
//            em.persist(member);
//            System.out.println("=====em.persist(member) after====");
//
//            System.out.println("=====em.persist(item) before====");
//            em.persist(item);
//            System.out.println("=====em.persist(item) after====");
//
//            System.out.println("=====em.find(em.find(Member.class, member.getId())) before====");
//            Member findMemeber = em.find(Member.class, 1L);
//            String memberName = findMemeber.getName();
//            System.out.println("memberName : " + memberName);
//            System.out.println("=====em.find(em.find(Member.class, member.getId())) after====");
//
//            String teamName = findMemeber.getTeam().getName();
//
//


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        em.close();
        emf.close();
    }
}
