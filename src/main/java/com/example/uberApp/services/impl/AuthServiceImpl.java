package com.example.uberApp.services.impl;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.SignupDto;
import com.example.uberApp.dto.UserDto;
import com.example.uberApp.entities.Rider;
import com.example.uberApp.entities.User;
import com.example.uberApp.entities.enums.Role;
import com.example.uberApp.exceptions.RunTimeConflictException;
import com.example.uberApp.repositories.UserRepository;
import com.example.uberApp.services.AuthService;
import com.example.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Set;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {

    public final ModelMapper modelMapper;
    public final UserRepository userRepository;
    public final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {

        User existingUser=userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(existingUser!=null){
            throw new RunTimeConflictException("Cannot signup, User already exist with email "+signupDto.getEmail());
        }

        User mappedUser= modelMapper.map(signupDto,User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser=userRepository.save(mappedUser);

        // create rider entity and wallet for each user
        riderService.createNewRider(savedUser);
        // TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
