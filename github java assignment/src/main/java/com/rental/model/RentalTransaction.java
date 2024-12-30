package com.rental.model;

// This class represents a rental transaction between a customer and a vehicle.
public class RentalTransaction {
    // The customer who is renting the vehicle.
    private Customer customer;
    // The vehicle being rented.
    private Vehicle vehicle;
    // The number of days for which the vehicle is rented.
    private int rentalDays;
    // The total cost of the rental.
    private double totalCost;
    // Indicates whether the rental is currently active.
    private boolean isActive;

    // Constructor initializes the rental transaction with a customer, vehicle, and rental duration.
    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer; // Assign the customer.
        this.vehicle = vehicle; // Assign the vehicle.
        this.rentalDays = rentalDays; // Set the rental duration.
        // Calculate the total rental cost using the vehicle's cost calculation method.
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
        this.isActive = true; // Set the rental transaction as active initially.
    }

    // Getter for the customer involved in the rental.
    public Customer getCustomer() {
        return customer;
    }

    // Getter for the vehicle being rented.
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Getter for the number of rental days.
    public int getRentalDays() {
        return rentalDays;
    }

    // Getter for the total cost of the rental.
    public double getTotalCost() {
        return totalCost;
    }

    // Getter to check if the rental is currently active.
    public boolean isActive() {
        return isActive;
    }

    // Marks the rental as complete by setting the active status to false.
    public void completeRental() {
        this.isActive = false;
    }

    // Overrides the default toString method to provide a meaningful representation of the transaction.
    @Override
    public String toString() {
        return "RentalTransaction{" +
               "customer=" + customer.getName() + // Include the customer's name.
               ", vehicle=" + vehicle.getModel() + " (" + vehicle.getId() + ")" +  // Include the vehicle model and ID.
               ", days=" + rentalDays + // Include the number of rental days.
               ", cost=" + totalCost + // Include the total cost of the rental.
               ", active=" + isActive + // Indicate whether the rental is active.
               '}';
    }
}
