package com.example.uberApp.services.impl;

import com.example.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point des) {
        // call the third party api osrm to calculate distance
        return 0;
    }
}
