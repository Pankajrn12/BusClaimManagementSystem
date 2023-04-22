package com.busManagementSystemClaim.busManagementSystemClaim.repositories;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
