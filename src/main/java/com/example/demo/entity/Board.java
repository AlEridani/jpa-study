package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "board_category",
//            joinColumns = @JoinColumn(name = "board_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id")
//    )
//    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//    private Set<Category> categories = new HashSet<>();
}
