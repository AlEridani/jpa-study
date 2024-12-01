package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
//
//    @ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
//    @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//    private Set<Board> boards = new HashSet<>();
}
