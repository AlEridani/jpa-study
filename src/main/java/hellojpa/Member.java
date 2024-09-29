package hellojpa;

import jakarta.persistence.*;
import org.hibernate.query.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Member")
public class Member {

    @Id @GeneratedValue
    @Column(name= "MEMBER_ID")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
