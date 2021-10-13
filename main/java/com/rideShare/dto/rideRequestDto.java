package com.rideShare.dto;

import com.rideShare.enums.SelectionStrategy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class rideRequestDto {
    private String origin;
    private String destination;
    SelectionStrategy selectionStrategy;


}
