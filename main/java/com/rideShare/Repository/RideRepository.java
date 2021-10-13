package com.rideShare.Repository;


import com.rideShare.dto.offerRideDto;
import com.rideShare.dto.userDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RideRepository extends JpaRepository<offerRideDto, Long>{
    @Override
    Optional<offerRideDto> findById(Long aLong);

    @Query("select inv from offerRideDto inv "
            + "where inv.origin in (:origin) " +
            "inv.destination = :Destination ")
    List<offerRideDto> getallrides(String origin, String Destination);
}
