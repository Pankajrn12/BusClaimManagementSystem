package com.busManagementSystemClaim.busManagementSystemClaim.repositories;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
