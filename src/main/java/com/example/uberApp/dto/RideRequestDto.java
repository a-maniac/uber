package com.example.uberApp.dto;

import com.example.uberApp.entities.Rider;
import com.example.uberApp.entities.enums.PaymentMethod;
import com.example.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
