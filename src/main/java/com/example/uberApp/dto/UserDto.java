package com.example.uberApp.dto;

import com.example.uberApp.entities.enums.Role;

import java.util.Set;

public class UserDto {

    private String name;
    private String email;
    private Set<Role> roles;
}
