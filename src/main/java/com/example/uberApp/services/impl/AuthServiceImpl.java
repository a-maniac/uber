package com.example.uberApp.services.impl;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.SignupDto;
import com.example.uberApp.dto.UserDto;
import com.example.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
