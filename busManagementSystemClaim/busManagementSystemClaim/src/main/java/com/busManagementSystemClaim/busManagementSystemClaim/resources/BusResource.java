package com.busManagementSystemClaim.busManagementSystemClaim.resources;

import com.busManagementSystemClaim.busManagementSystemClaim.models.*;
import com.busManagementSystemClaim.busManagementSystemClaim.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping("/claim")
public class BusResource {
    @Autowired
    BusService busService;

    @PostMapping("/saveBusDetails")
    public ResponseEntity saveBusDetails(@RequestBody BusModel busModel){
        return busService.saveBusDetails(busModel);
    }

    @PostMapping("/savePassengerDetails")
    public ResponseEntity savePassengerDetails(@RequestBody PassengerModel passengerModel){
        return busService.savePassengerDetails(passengerModel);
    }
    @PostMapping("/saveDriverDetails")
    public ResponseEntity saveDriverDetails(@RequestBody DriverModel driverModel){
       return busService.saveDriverDetails(driverModel);
    }

    @PostMapping("/SaveRouteDetails")
    public ResponseEntity SaveRouteDetails(@RequestBody RouteModel routeModel){
        return busService.SaveRouteDetails(routeModel);
    }

    @PostMapping("/saveBusAssignmentDetails")
    public ResponseEntity saveBusAssignmentDetails(@RequestBody BusAssignmentModel busAssignmentModel){
        return busService.saveBusAssignmentDetails(busAssignmentModel);
    }

    @PostMapping("/saveClaimDetails")
    public ResponseEntity saveClaimDetails(@RequestBody ClaimModel claimModel){
        return busService.saveClaimDetails(claimModel);
    }

    @GetMapping("/getAllPassengerDetails")
    public LinkedList<PassengerModel> getAllPassengerDetails(){
        return busService.getAllPassengerDetails();
    }

    @GetMapping("/getAllBusDetails")
    public LinkedList<BusModel> getAllBusDetails(){
        return busService.getAllBusDetails();
    }

    @GetMapping("/getClaimAllDetails")
    public LinkedList<ClaimModel> getClaimAllDetails(){
        return busService.getClaimAllDetails();
    }

    @GetMapping("/getALlDetailsRoute")
    public LinkedList<RouteModel> getALlDetailsRoute(){
        return busService.getALlDetailsRoute();
    }

    @GetMapping("/getBusAssignmentDetails")
    public LinkedList<BusAssignmentModel> getBusAssignmentDetails(){
        return busService.getBusAssignmentDetails();
    }

    @GetMapping("/getDriverDetails")
    public LinkedList<DriverModel> getDriverDetails(){
        return busService.getDriverDetails();
    }

    @PutMapping("/updateBusDetails")
    public ResponseEntity updateBusDetails(@RequestBody BusModel busModel){
        return busService.updateBusDetails(busModel);
    }

    @PutMapping("/updateDriverDetails")
    public ResponseEntity updateDriverDetails(@RequestBody DriverModel driverModel){
        return busService.updateDriverDetails(driverModel);
    }
    @PutMapping("/updateRouteDetails")
    public ResponseEntity updateRouteDetails(@RequestBody RouteModel routeModel){
        return busService.updateRouteDetails(routeModel);
    }
    @DeleteMapping("/deleteClaimById/{claimId}")
    public ResponseEntity deleteClaimById(@PathVariable("claimId") Long claimId){
        return busService.deleteClaimById(claimId);
    }

    @DeleteMapping("/DeleteBusAssignmentById/{busAssignmentId}")
    public ResponseEntity DeleteBusAssignmentById(@PathVariable("busAssignmentId") Long busAssignmentId){
        return busService.busAssignmentId(busAssignmentId);
    }
}
