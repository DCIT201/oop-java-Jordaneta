package com.rental.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentedVehicles;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    /**
     * Gets the customer's unique identifier.
     * 
     * @return The customer ID as a String
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Gets the customer's full name.
     * 
     * @return The customer's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the list of vehicles currently rented by the customer.
     * 
     * @return List of Vehicle objects currently rented
     */
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    /**
     * Adds a vehicle to customer's list of rented vehicles.
     * 
     * @param vehicle The Vehicle object to be rented
     */
    public void rentVehicle(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    /**
     * Removes a vehicle from customer's list of rented vehicles.
     * 
     * @param vehicle The Vehicle object to be returned
     */
    public void returnVehicle(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
    }
}
