package com.busManagementSystemClaim.busManagementSystemClaim.repositories;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
