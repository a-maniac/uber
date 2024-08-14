package com.example.uberApp.strategies.impl;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.RideRequest;
import com.example.uberApp.services.DistanceService;
import com.example.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Primary
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance= distanceService.calculateDistance(rideRequest.getPickupLocation()
        ,rideRequest.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
