package com.example.demo.service;

import com.example.demo.entity.Dummy;
import com.example.demo.repository.DummyRepository;
import jakarta.persistence.Cacheable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DummyService {

    private final DummyRepository dummyRepository;


    public List<Dummy> getAllDummys() {
        return dummyRepository.findAll();
    }
}
