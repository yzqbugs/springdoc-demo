package com.example.springdocdemo.controller;

import com.example.springdocdemo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanni
 * @date time 2022/1/21 3:06
 * @modified By:
 */
@RestController
@RequestMapping("/user")
public class HelloController {
    /**
     *
     *
     * @param user
     * @return {@link User}
     */
    @PostMapping("/query")
    public User query(User user) {
        return user;
    }
    @PostMapping("/body")
    public  User body(@RequestBody  User user) {
        return user;
    }
}
