package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Order order = new Order();
            order.addOrderItems(new OrderItem());

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        em.close();
        emf.close();
    }
}
