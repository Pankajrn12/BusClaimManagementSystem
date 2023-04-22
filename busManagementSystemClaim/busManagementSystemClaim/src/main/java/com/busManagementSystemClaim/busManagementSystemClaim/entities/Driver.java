package com.busManagementSystemClaim.busManagementSystemClaim.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long driverId;
    private String driverName;
    private String driverAddress;
    private String driverContactNumber;
    private String driverLicenseNumber;



}
