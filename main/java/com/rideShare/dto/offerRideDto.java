package com.rideShare.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class offerRideDto {
    private String vehicleNam;
    private String origin;
    private String destination;
    private String availableSeats;
    vehicleDetailDto vehicleDetailDto;
    private String startTime;
    private String rideDuration;
}
