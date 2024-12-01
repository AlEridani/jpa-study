package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/{id}")
    public Board getBoard(@PathVariable Long id) {
        log.info("getBoard {}", id);
        Optional<Board> board = boardService.getBoard(id);
        return board.orElse(null);
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        log.info("createBoard {}", board);
        return boardService.saveBoard(board);
    }

    @PutMapping("/{id}")
    public Board updateBoard(@PathVariable Long id, @RequestBody Board board) {
        log.info("updateBoard {}{}", id, board);
        return boardService.saveBoard(board);
    }

    @DeleteMapping("/{id}")
    public String deleteBoard(@PathVariable Long id) {
        log.info("deleteBoard {}", id);
        boardService.deleteBoard(id);
        return "success";
    }
}
