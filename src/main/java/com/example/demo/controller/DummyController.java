package com.example.demo.controller;

import com.example.demo.entity.Dummy;
import com.example.demo.service.DummyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DummyController {
    private final DummyService dummyService;


    @GetMapping("/dummys")
    public List<Dummy> getAllDummys(){
        return dummyService.getAllDummys();
    }
}
