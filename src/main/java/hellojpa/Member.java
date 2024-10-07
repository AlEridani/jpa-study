package hellojpa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name="Member")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "MEMBER_ID")
    private Long id;
    private String name;
    private int age;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable=false, updatable=false)
    private Team  team;

}
