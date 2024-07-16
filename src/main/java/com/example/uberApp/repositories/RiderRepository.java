package com.example.uberApp.repositories;

import com.example.uberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RiderRepository extends JpaRepository<Rider,Long> {
}
