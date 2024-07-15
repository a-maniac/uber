package com.example.uberApp.entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    private Double rating;
    private boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)") // for earth's longitude and latitude
    Point currentLocation;

}
