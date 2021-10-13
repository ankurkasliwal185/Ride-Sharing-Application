package com.rideShare.Repository;


import com.rideShare.dto.userDetailDto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepository extends JpaRepository<userDetailDto, Long>{


}
