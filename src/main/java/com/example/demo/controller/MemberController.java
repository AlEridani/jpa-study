package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/member")
    public String getMember() {
        log.info("getMember");
        return "member";
    }

    @PostMapping("/member")
    public String postMember() {
        log.info("postMember");
        return "post member";
    }
}
