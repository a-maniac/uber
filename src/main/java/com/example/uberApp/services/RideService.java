package com.example.uberApp.services;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.RideDto;
import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.dto.RiderDto;
import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.Ride;
import com.example.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RideService {

    Ride getRideByID(Long rideId);

    void matchWithDriver(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);

}
