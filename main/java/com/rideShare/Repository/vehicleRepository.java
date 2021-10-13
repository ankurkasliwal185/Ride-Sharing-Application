package com.rideShare.Repository;


import com.rideShare.dto.userDetailDto;
import com.rideShare.dto.vehicleDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vehicleRepository extends JpaRepository<vehicleDetailDto, Long>{


}
