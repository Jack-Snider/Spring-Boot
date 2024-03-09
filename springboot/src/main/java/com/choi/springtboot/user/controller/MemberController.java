package com.choi.springtboot.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello, World!";
    }

    @PostMapping("/join")
    public String join(){
        return "string";
    }


}
