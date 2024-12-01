package com.example.demo.cache;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
public class CacheTest {

    @Autowired
    private BoardService boardService;



}
