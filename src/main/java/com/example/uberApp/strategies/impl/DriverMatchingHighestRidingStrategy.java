package com.example.uberApp.strategies.impl;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.RideRequest;
import com.example.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRidingStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return List.of();
    }
}
