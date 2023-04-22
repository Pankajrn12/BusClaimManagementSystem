package com.busManagementSystemClaim.busManagementSystemClaim.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long passengerId;
    private String passengerName;
    private String passengerContactNumber;
    private String passengerAddress;
    private String passengerEmail;


}
