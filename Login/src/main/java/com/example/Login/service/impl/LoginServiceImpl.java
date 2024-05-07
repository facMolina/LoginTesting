package com.example.Login.service.impl;

import com.example.Login.dto.request.LoginRequest;
import com.example.Login.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
