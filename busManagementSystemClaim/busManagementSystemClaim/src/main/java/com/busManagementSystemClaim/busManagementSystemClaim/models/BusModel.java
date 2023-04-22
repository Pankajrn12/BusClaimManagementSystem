package com.busManagementSystemClaim.busManagementSystemClaim.models;


public class BusModel {
    private Long busId;
    private String busNumber;
    private String busType;
    private Long seatingCapacity;

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public Long getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Long seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }


    @Override
    public String toString() {
        return "BusModel{" +
                "busId=" + busId +
                ", busNumber='" + busNumber + '\'' +
                ", busType='" + busType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
