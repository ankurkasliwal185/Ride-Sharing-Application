package com.rideShare.controller;

import com.google.gson.Gson;
import com.rideShare.dto.offerRideDto;
import com.rideShare.dto.rideRequestDto;
import com.rideShare.dto.userDetailDto;
import com.rideShare.dto.vehicleDetailDto;
import com.rideShare.services.userService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class userDetail {
    @Autowired
    userService userService;
    @Autowired
    Gson gson;


    @PostMapping
    public ResponseEntity<String> adduser(userDetailDto createUser, HttpServletRequest httpServletRequest)
    {
           userService.adduser(createUser);
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

    @PostMapping("/veh")
    public ResponseEntity<String> addVehicle(vehicleDetailDto addVehicle, HttpServletRequest httpServletRequest)
    {
        userService.addVehicle(addVehicle);
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

    @PostMapping("off")
    public ResponseEntity<String> offerRide(offerRideDto offerRideDto, HttpServletRequest httpServletRequest)
    {
        userService.addRide(offerRideDto);
        return (ResponseEntity<String>) ResponseEntity.ok();
    }
    @PostMapping("findride")
    public ResponseEntity<String> findRide(rideRequestDto rideRequestDto, HttpServletRequest httpServletRequest)
    {
        offerRideDto offerRideDto = userService.getRide(rideRequestDto);
        return new ResponseEntity<String>(gson.toJsonTree(offerRideDto).toString(), HttpStatus.OK);
    }
//    @GetMapping
//    public ResponseEntity<String> fulesavedbyPassenger(HttpServletRequest httpServletRequest)
//    {
//
//
//    }

}
