package com.example.uberApp.strategies;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
