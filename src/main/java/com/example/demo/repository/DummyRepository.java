package com.example.demo.repository;

import com.example.demo.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
    List<Dummy>findTop100By();
}
