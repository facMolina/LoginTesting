package com.example.Login.controller;

import com.example.Login.dto.request.LoginRequest;
import com.example.Login.service.LoginService;
import lombok.RequiredArgsConstructor;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.application.name}")
@Validated
public class LoginController {

    private final LoginService service;


    @GetMapping("/login")
    public String login(@RequestParam String username,
                            @RequestParam String password){
        return this.service.login(username, password);
    }

}
