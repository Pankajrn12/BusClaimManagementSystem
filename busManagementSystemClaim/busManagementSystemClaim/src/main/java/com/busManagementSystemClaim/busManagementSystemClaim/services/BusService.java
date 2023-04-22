package com.busManagementSystemClaim.busManagementSystemClaim.services;

import com.busManagementSystemClaim.busManagementSystemClaim.entities.*;
import com.busManagementSystemClaim.busManagementSystemClaim.models.*;
import com.busManagementSystemClaim.busManagementSystemClaim.repositories.*;
import com.busManagementSystemClaim.busManagementSystemClaim.utilities.DateUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.LinkedList;

@Service
public class BusService {
    @Autowired
    BusRepository busRepository;
    @Autowired
    BusAssignmentRepository busAssignmentRepository;
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    ClaimRepository claimRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    RoutRepository routRepository;
    @Autowired
    EntityManager entityManager;

    @Transactional
    public ResponseEntity saveBusDetails(BusModel busModel) {
        Bus bus = new Bus();
        bus.setBusId(busModel.getBusId());
        bus.setBusNumber(busModel.getBusNumber());
        bus.setBusType(busModel.getBusType());
        bus.setSeatingCapacity(busModel.getSeatingCapacity());

        busRepository.save(bus);

        return new ResponseEntity<>("saved Data", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity savePassengerDetails(PassengerModel passengerModel) {
        Passenger passenger = new Passenger();
        passenger.setPassengerId(passengerModel.getPassengerId());
        passenger.setPassengerAddress(passengerModel.getPassengerAddress());
        passenger.setPassengerName(passengerModel.getPassengerName());
        passenger.setPassengerEmail(passengerModel.getPassengerEmail());
        passenger.setPassengerContactNumber(passengerModel.getPassengerContactNumber());

        passengerRepository.save(passenger);

        return new ResponseEntity<>("saved Data Passenger Details", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveDriverDetails(DriverModel driverModel) {
        Driver driver = new Driver();
        driver.setDriverId(driverModel.getDriverId());
        driver.setDriverAddress(driverModel.getDriverAddress());
        driver.setDriverName(driverModel.getDriverName());
        driver.setDriverLicenseNumber(driverModel.getDriverLicenseNumber());
        driver.setDriverContactNumber(driverModel.getDriverContactNumber());

        driverRepository.save(driver);
        return new ResponseEntity<>("Saved data driver Details", HttpStatus.OK);
    }
    @Transactional
    public ResponseEntity SaveRouteDetails(RouteModel routeModel) {
        Route route = new Route();
        route.setRouteId(routeModel.getRouteId());
        route.setRouteName(routeModel.getRouteName());
        route.setBusType(routeModel.getBusType());
        route.setSeatingCapacity(routeModel.getSeatingCapacity());

        routRepository.save(route);

        return new ResponseEntity<>("Data saved Route Details",HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveBusAssignmentDetails(BusAssignmentModel busAssignmentModel) {
        BusAssignment assignment = new BusAssignment();
        assignment.setBusId(busAssignmentModel.getBusId());
        assignment.setAssignmentDate(DateUtility.getCurrentDate());
        assignment.setDriverId(busAssignmentModel.getDriverId());
        assignment.setRouteId(busAssignmentModel.getRouteId());
        assignment.setBusAssignmentID(busAssignmentModel.getBusAssignmentId());

        busAssignmentRepository.save(assignment);

        return new ResponseEntity<>("Saved Data BussAssignment Details",HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveClaimDetails(ClaimModel claimModel) {
        Claim claim = new Claim();
        claim.setClaimDate(DateUtility.getCurrentDate());
        claim.setClaimId(claimModel.getClaimId());
        claim.setAssignmentId(claimModel.getAssignmentId());
        claim.setPassengerContactNumber(claimModel.getPassengerContactNumber());
        claim.setPassengerDescription(claimModel.getPassengerDescription());
        claim.setPassengerId(claimModel.getPassengerId());

        claimRepository.save(claim);
        return new ResponseEntity<>("Saved Claim Details", HttpStatus.OK);
    }

    public LinkedList<PassengerModel> getAllPassengerDetails() {
        LinkedList<PassengerModel> passengerModelLinkedList = new LinkedList<>();
        LinkedList<Passenger> passengerLinkedList = new LinkedList<>(passengerRepository.findAll());
        passengerLinkedList.stream().forEach(data->{
            PassengerModel model = new PassengerModel();
            model.setPassengerId(data.getPassengerId());
            model.setPassengerAddress(data.getPassengerAddress());
            model.setPassengerEmail(data.getPassengerEmail());
            model.setPassengerName(data.getPassengerName());
            model.setPassengerContactNumber(data.getPassengerContactNumber());

            passengerModelLinkedList.add(model);
        });
        return passengerModelLinkedList;
    }

    public LinkedList<BusModel> getAllBusDetails() {
        LinkedList<BusModel> busModelLinkedList = new LinkedList<>();
        LinkedList<Bus> busLinkedList = new LinkedList<>(busRepository.findAll());
        busLinkedList.stream().forEach(data->{
            BusModel model = new BusModel();
            model.setBusId(data.getBusId());
            model.setBusNumber(data.getBusNumber());
            model.setBusType(data.getBusType());
            model.setSeatingCapacity(data.getSeatingCapacity());

            busModelLinkedList.add(model);
        });
        return busModelLinkedList;
    }

    public LinkedList<ClaimModel> getClaimAllDetails() {
        LinkedList<ClaimModel> claimModelLinkedList = new LinkedList<>();
        LinkedList<Claim> claimLinkedList = new LinkedList<>(claimRepository.findAll());
        claimLinkedList.stream().forEach(data->{
            ClaimModel model = new ClaimModel();
            model.setClaimId(data.getClaimId());
            model.setAssignmentId(data.getAssignmentId());
            model.setPassengerId(data.getPassengerId());
            model.setPassengerDescription(data.getPassengerDescription());
            model.setPassengerContactNumber(data.getPassengerContactNumber());

            claimModelLinkedList.add(model);
        });
        return claimModelLinkedList;
    }

    public LinkedList<RouteModel> getALlDetailsRoute() {
        LinkedList<RouteModel> routeModelLinkedList = new LinkedList<>();
        LinkedList<Route> routeLinkedList = new LinkedList<>(routRepository.findAll());
        routeLinkedList.stream().forEach(data->{
            RouteModel model = new RouteModel();
            model.setBusType(data.getBusType());
            model.setRouteId(data.getRouteId());
            model.setRouteName(data.getRouteName());
            model.setSeatingCapacity(data.getSeatingCapacity());


            routeModelLinkedList.add(model);
        });
        return routeModelLinkedList;
    }

    public LinkedList<BusAssignmentModel> getBusAssignmentDetails() {
        LinkedList<BusAssignmentModel> busAssignmentModelLinkedList = new LinkedList<>();
        LinkedList<BusAssignment> busAssignmentLinkedList = new LinkedList<>(busAssignmentRepository.findAll());
        busAssignmentLinkedList.stream().forEach(data->{
            BusAssignmentModel model = new BusAssignmentModel();
            model.setBusAssignmentId(data.getBusAssignmentID());
            model.setAssignmentDate(DateUtility.getCurrentDate().toString());
            model.setBusId(data.getBusId());
            model.setDriverId(data.getDriverId());
            model.setRouteId(data.getRouteId());


            busAssignmentModelLinkedList.add(model);
        });
        return busAssignmentModelLinkedList;
    }

    public LinkedList<DriverModel> getDriverDetails() {
        LinkedList<DriverModel> driverModelLinkedList = new LinkedList<>();
        LinkedList<Driver> driverLinkedList = new LinkedList<>(driverRepository.findAll());
        driverLinkedList.stream().forEach(data->{
            DriverModel model = new DriverModel();
            model.setDriverContactNumber(data.getDriverContactNumber());
            model.setDriverAddress(data.getDriverAddress());
            model.setDriverName(data.getDriverName());
            model.setDriverId(data.getDriverId());
            model.setDriverLicenseNumber(data.getDriverLicenseNumber());


            driverModelLinkedList.add(model);
        });
        return driverModelLinkedList;
    }

    @Transactional
    public ResponseEntity updateBusDetails(BusModel busModel) {
        entityManager.createNativeQuery("update claim.bus set bus_number =:bus_number , bus_type =:bus_type , seating_capacity =:seating_capacity  where bus_id =:bus_id ")
                .setParameter("bus_number",busModel.getBusNumber())
                .setParameter("bus_type",busModel.getBusType())
                .setParameter("seating_capacity", busModel.getSeatingCapacity())
                .setParameter("bus_id",busModel.getBusId()).executeUpdate();
        return new ResponseEntity<>("Update All Bus Details",HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity updateDriverDetails(DriverModel driverModel) {
        entityManager.createNativeQuery("update claim.driver set driver_address =:driver_address , driver_contact_number =:driver_contact_number , driver_license_number =:driver_license_number , driver_name =:driver_name  where driver_id=:driver_id ")
                .setParameter("driver_address",driverModel.getDriverAddress())
                .setParameter("driver_contact_number",driverModel.getDriverContactNumber())
                .setParameter("driver_license_number",driverModel.getDriverLicenseNumber())
                .setParameter("driver_name",driverModel.getDriverName())
                .setParameter("driver_id", driverModel.getDriverId()).executeUpdate();
        return new ResponseEntity<>("updated Driver Details",HttpStatus.OK);
    }

    public ResponseEntity updateRouteDetails(RouteModel routeModel) {
        entityManager.createNativeQuery("update claim.route set bus_type =:bus_type , route_name =:route_name , seating_capacity =:seating_capacity  where route_id =:route_id ")
                .setParameter("bus_type",routeModel.getBusType())
                .setParameter("route_name",routeModel.getRouteName())
                .setParameter("seating_capacity",routeModel.getSeatingCapacity())
                .setParameter("route_id", routeModel.getRouteId()).executeUpdate();
        return new ResponseEntity<>("Data Updated Route Details ",HttpStatus.OK);
    }

    public ResponseEntity deleteClaimById(Long claimId) {
        claimRepository.deleteById(claimId);
        return new ResponseEntity<>("Data Deleted Claim Details ",HttpStatus.OK);
    }

    public ResponseEntity busAssignmentId(Long busAssignmentId) {
        busAssignmentRepository.deleteById(busAssignmentId);
        return new ResponseEntity<>("Deleted Buss Assignment details ",HttpStatus.OK);
    }
}
