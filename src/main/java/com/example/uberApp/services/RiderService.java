package com.example.uberApp.services;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.RideDto;
import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.dto.RiderDto;
import com.example.uberApp.entities.Ride;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId,Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
