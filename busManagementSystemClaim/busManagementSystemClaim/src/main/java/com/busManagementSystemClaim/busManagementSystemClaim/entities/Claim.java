package com.busManagementSystemClaim.busManagementSystemClaim.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long claimId;
    private Long assignmentId;
    private Long passengerId;
    private String passengerContactNumber;
    private String passengerDescription;
    private Date claimDate;


}
