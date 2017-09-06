package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by whilemouse on 17. 9. 6.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String user(){
        return "user";
    }

}
