package com.rideShare.services.impl;

import com.rideShare.Repository.RideRepository;
import com.rideShare.Repository.userRepository;
import com.rideShare.Repository.vehicleRepository;
import com.rideShare.dto.offerRideDto;
import com.rideShare.dto.rideRequestDto;
import com.rideShare.dto.userDetailDto;
import com.rideShare.dto.vehicleDetailDto;
import com.rideShare.enums.SelectionStrategy;
import com.rideShare.services.userService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class userServiceImpl implements userService {
    @Autowired
    userRepository userRepository;
    @Autowired
    vehicleRepository vehicleRepository;
    @Autowired
    RideRepository rideRepository;

    @Override
    public void adduser(userDetailDto createUserReqDto) {
        userDetailDto userDetailDto = new userDetailDto();
        userDetailDto.setName(createUserReqDto.getName());
        userDetailDto.setAge(createUserReqDto.getAge());
        userDetailDto.setGender(createUserReqDto.getGender());
        userRepository.save(userDetailDto);
    }

    @Override
    public void addVehicle(vehicleDetailDto createVehicleReqDto) {
        vehicleDetailDto vehicleDetailDto= new vehicleDetailDto();
        vehicleDetailDto.setName(createVehicleReqDto.getName());
        vehicleDetailDto.setVehicleName(createVehicleReqDto.getVehicleName());
        vehicleDetailDto.setVehicleNumber(createVehicleReqDto.getVehicleNumber());
        vehicleRepository.save(vehicleDetailDto);
    }

    @Override
    public void addRide(offerRideDto offerRideDto) {
        offerRideDto offerRideDto1=new offerRideDto();
        offerRideDto1.setAvailableSeats(offerRideDto.getAvailableSeats());
        offerRideDto1.setDestination(offerRideDto.getDestination());
        offerRideDto1.setRideDuration(offerRideDto.getRideDuration());
        offerRideDto1.setOrigin(offerRideDto.getOrigin());
        offerRideDto1.setVehicleNam(offerRideDto.getVehicleNam());
        offerRideDto1.setVehicleDetailDto(offerRideDto.getVehicleDetailDto());
        rideRepository.save(offerRideDto1);

    }

    @Override
    public offerRideDto getRide(rideRequestDto rideRequestDto) {
        String origin = rideRequestDto.getOrigin();
        String destination=rideRequestDto.getDestination();

        List<offerRideDto> offerRideDtoList=rideRepository.getallrides(origin,destination);
        if(rideRequestDto.getSelectionStrategy().equals(SelectionStrategy.FastestRide)){


        }else{


        }

        return null;
    }


}
