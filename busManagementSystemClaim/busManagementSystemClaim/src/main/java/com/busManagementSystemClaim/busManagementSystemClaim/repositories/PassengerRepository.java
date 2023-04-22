package com.busManagementSystemClaim.busManagementSystemClaim.repositories;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger , Long> {
}
