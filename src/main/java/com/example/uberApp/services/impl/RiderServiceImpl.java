package com.example.uberApp.services.impl;

import com.example.uberApp.dto.DriverDto;
import com.example.uberApp.dto.RideDto;
import com.example.uberApp.dto.RideRequestDto;
import com.example.uberApp.dto.RiderDto;
import com.example.uberApp.entities.Ride;
import com.example.uberApp.entities.RideRequest;
import com.example.uberApp.entities.Rider;
import com.example.uberApp.entities.User;
import com.example.uberApp.entities.enums.RideRequestStatus;
import com.example.uberApp.repositories.RideRequestRepository;
import com.example.uberApp.repositories.RiderRepository;
import com.example.uberApp.services.RiderService;
import com.example.uberApp.strategies.DriverMatchingStrategy;
import com.example.uberApp.strategies.RideFareCalculationStrategy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    Logger log= LoggerFactory.getLogger(RiderServiceImpl.class);

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest=modelMapper.map(rideRequestDto,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare= rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest=rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDrivers(rideRequest);

        //log.info(rideRequest.toString());
        return modelMapper.map(savedRideRequest,RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides(PageRequest pageRequest) {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider= Rider.builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }
}
