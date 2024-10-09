//package hellojpa;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@Table(name = "LOCKER")
//@NoArgsConstructor
//public class Locker {
//
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @OneToOne
//    @JoinColumn(name = "MEMBER_ID")
//    private Member member;
//}
