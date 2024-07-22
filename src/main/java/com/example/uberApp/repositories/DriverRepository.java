package com.example.uberApp.repositories;

import com.example.uberApp.entities.Driver;
import com.example.uberApp.entities.Ride;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//code for driverRepo
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
    Page<Ride> findAll(Long driverId, PageRequest pageRequest);
}
