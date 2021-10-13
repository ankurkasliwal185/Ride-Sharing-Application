package com.rideShare.services;

import com.rideShare.dto.offerRideDto;
import com.rideShare.dto.rideRequestDto;
import com.rideShare.dto.userDetailDto;
import com.rideShare.dto.vehicleDetailDto;
import org.springframework.stereotype.Service;

@Service
public interface userService {

	void adduser(userDetailDto createInvoiceReqDto) ;
	void addVehicle(vehicleDetailDto createInvoiceReqDto) ;
	void addRide(offerRideDto offerRideDto);
	offerRideDto getRide(rideRequestDto rideRequestDto);

}
