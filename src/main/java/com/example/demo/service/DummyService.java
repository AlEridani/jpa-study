package com.example.demo.service;

import com.example.demo.entity.Dummy;
import com.example.demo.repository.DummyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DummyService {

    private final DummyRepository dummyRepository;


    public List<Dummy> getAllDummys() {
        return dummyRepository.findAll();
    }

    public List<Dummy> getPagingDummys() {
        return dummyRepository.findTop100By();
    }
}
