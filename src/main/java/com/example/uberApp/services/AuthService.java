package com.example.uberApp.services;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.SignupDto;
import com.example.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
