package com.busManagementSystemClaim.busManagementSystemClaim.repositories;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutRepository extends JpaRepository<Route, Long> {
}
