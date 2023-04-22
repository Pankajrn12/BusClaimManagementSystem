package com.busManagementSystemClaim.busManagementSystemClaim.models;


public class RouteModel {
    private Long routeId;
    private String routeName;
    private String busType;
    private String seatingCapacity;


    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "RouteModel{" +
                "routeId=" + routeId +
                ", routeName='" + routeName + '\'' +
                ", busType='" + busType + '\'' +
                ", seatingCapacity='" + seatingCapacity + '\'' +
                '}';
    }
}
