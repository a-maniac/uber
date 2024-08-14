package com.example.uberApp.strategies;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER=10;

    double calculateFare(RideRequest rideRequest);
}
