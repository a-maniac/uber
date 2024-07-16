package com.example.uberApp.dto;

import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.enums.PaymentMethod;
import com.example.uberApp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime; //driver accepts ride
    private RiderDto rider;
    private Driver driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt; //driver starts the ride
    private LocalDateTime endedAt;
    private String otp;
}
