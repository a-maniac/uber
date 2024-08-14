package com.example.uberApp.strategies.impl;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.RideRequest;
import com.example.uberApp.strategies.RideFareCalculationStrategy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePriceFareCalculationStrategy  implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
