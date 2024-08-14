package com.example.uberApp.controllers;

import com.example.uberApp.dto.SignupDto;
import com.example.uberApp.dto.UserDto;
import com.example.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    UserDto signUp(@RequestBody SignupDto signupDto){
        return authService.signup(signupDto);
    }
}
