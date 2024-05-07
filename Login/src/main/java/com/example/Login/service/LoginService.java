package com.example.Login.service;

import com.example.Login.dto.request.LoginRequest;

public interface LoginService {

    String login(String username, String password);
}
