package com.busManagementSystemClaim.busManagementSystemClaim.models;

public class BusAssignmentModel {
    private Long busAssignmentId;
    private Long busId;
    private Long driverId;
    private Long routeId;
    private String assignmentDate;

    public Long getBusAssignmentId() {
        return busAssignmentId;
    }

    public void setBusAssignmentId(Long busAssignmentId) {
        this.busAssignmentId = busAssignmentId;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(String assignmentDate) {
        this.assignmentDate = assignmentDate;
    }




    @Override
    public String toString() {
        return "BusAssignmentModel{" +
                "busAssignmentId=" + busAssignmentId +
                ", busId=" + busId +
                ", driverId=" + driverId +
                ", routeId=" + routeId +
                ", assignmentDate='" + assignmentDate + '\'' +
                '}';
    }
}
