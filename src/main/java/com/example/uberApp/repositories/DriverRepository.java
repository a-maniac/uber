package com.example.uberApp.repositories;

import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.Ride;
import org.locationtech.jts.geom.Point;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//code for driverRepo

// ST_Distance(point1, point2)   --- spatial db distance b.w two points
// ST_DWithin(point 1 , point2 , 10000) ---- within 10km
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{

    @Query(value = "Select d.*, ST_Distance(d.current_location, :pickupLocation) AS distance " +
            "From drivers as d " +
            "where available=true ST_DWithin(d.current_location, :pickupLocation , 10000) " +
            "order by distance " +
            "LIMIT 10", nativeQuery = true)
    List<Driver> findTenNearestDrivers(Point pickupLocation);
    //Page<Ride> findAll(Long driverId, PageRequest pageRequest);
}
