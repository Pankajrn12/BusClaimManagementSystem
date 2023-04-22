package com.busManagementSystemClaim.busManagementSystemClaim.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Timer;

@Entity
@Data
public class BusAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long busAssignmentID;
    private Long busId;
    private Long driverId;
    private Long routeId;
    private Date assignmentDate;
    private String arrivalDate;

}
