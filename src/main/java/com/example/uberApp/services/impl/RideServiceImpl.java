package com.example.uberApp.services.impl;

import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.Ride;
import com.example.uberApp.entities.enums.RideStatus;
import com.example.uberApp.repositories.DriverRepository;
import com.example.uberApp.repositories.RideRepository;
import com.example.uberApp.repositories.RiderRepository;
import com.example.uberApp.services.RideService;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {

    @Autowired
    RideRepository rideRepository;

    @Autowired
    RiderRepository riderRepository;

    @Autowired
    DriverRepository driverRepository;

    @Override
    public Ride getRideByID(Long rideId) {
        return rideRepository.findById(rideId).orElse(null);
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

//    @Override
//    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
//
//        return riderRepository.findAll(riderId);
//    }

//    @Override
//    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
//
//        return driverRepository.findAll(driverId,pageRequest);
//    }
}
