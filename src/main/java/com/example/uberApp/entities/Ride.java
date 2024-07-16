package com.example.uberApp.entities;

import com.example.uberApp.entities.enums.PaymentMethod;
import com.example.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
public class Ride {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime; //driver accepts ride

    // one rider can have many rider request
    //lazy will get data only when required or when i am using rider in code
    //really handy if we don't want to load all data from db
    @ManyToOne(fetch=FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch=FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private String otp;

    private Double fare;
    private LocalDateTime startedAt; //driver starts the ride
    private LocalDateTime endedAt; //driver ends the ride

}
