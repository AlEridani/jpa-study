//package hellojpa;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class OrderItem {
//
//    @Id @GeneratedValue
//    @Column(name = "ORDER_ITEM_ID")
//    private Long id;
//
//
//    @ManyToOne
//    @JoinColumn(name = "ITEM_ID")
//    private Product product;
//
//    @ManyToOne
//    @JoinColumn(name ="ORDER_ID")
//    private Order order;
//
//    private int orderPrice;
//    private int count;
//
//
//
//}
