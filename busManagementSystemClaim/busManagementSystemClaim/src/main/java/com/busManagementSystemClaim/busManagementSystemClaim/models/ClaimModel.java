package com.busManagementSystemClaim.busManagementSystemClaim.models;


public class ClaimModel {
    private Long claimId;
    private Long assignmentId;
    private Long passengerId;
    private String passengerContactNumber;
    private String passengerDescription;

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerContactNumber() {
        return passengerContactNumber;
    }

    public void setPassengerContactNumber(String passengerContactNumber) {
        this.passengerContactNumber = passengerContactNumber;
    }

    public String getPassengerDescription() {
        return passengerDescription;
    }

    public void setPassengerDescription(String passengerDescription) {
        this.passengerDescription = passengerDescription;
    }


    @Override
    public String toString() {
        return "ClaimModel{" +
                "claimId=" + claimId +
                ", assignmentId=" + assignmentId +
                ", passengerId='" + passengerId + '\'' +
                ", passengerContactNumber='" + passengerContactNumber + '\'' +
                ", passengerDescription='" + passengerDescription + '\'' +
                '}';
    }
}
