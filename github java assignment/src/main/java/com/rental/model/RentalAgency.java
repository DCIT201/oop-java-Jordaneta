package com.rental.model;

import java.util.List;

/**
 * Manages the vehicle rental operations for the rental agency.
 * Handles fleet management, vehicle rentals and returns.
 */
public class RentalAgency {

    /** List of vehicles available in the rental agency's fleet */
    private List<Vehicle> fleet;

    /**
     * Constructs a new RentalAgency with an initial fleet of vehicles.
     * 
     * @param fleet List of vehicles to initialize the agency with
     */
    public RentalAgency(List<Vehicle> fleet) {
        this.fleet = fleet;
    }

    /**
     * Gets the current fleet of vehicles.
     * 
     * @return List of all vehicles in the agency's fleet
     */
    public List<Vehicle> getFleet() {
        return fleet;
    }

    /**
     * Processes a vehicle rental request.
     * 
     * @param vehicle The vehicle to be rented
     * @param customer The customer renting the vehicle
     * @param days Number of days for the rental period
     */
    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            customer.rentVehicle(vehicle);
            System.out.println("Vehicle rented: " + vehicle);
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }

    /**
     * Processes a vehicle return from a customer.
     * 
     * @param vehicle The vehicle being returned
     * @param customer The customer returning the vehicle
     */
    public void returnVehicle(Vehicle vehicle, Customer customer) {
        vehicle.setAvailable(true);
        customer.returnVehicle(vehicle);
        System.out.println("Vehicle returned: " + vehicle);
    }

    /**
     * Displays all available vehicles in the fleet.
     */
    public void displayAvailableVehicles() {
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.toString());
            }
        }
    }
}
