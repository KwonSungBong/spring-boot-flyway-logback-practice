package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by whilemouse on 17. 9. 6.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String user(){
        log.info("TESTTESTTEST");
        return "user";
    }

}
