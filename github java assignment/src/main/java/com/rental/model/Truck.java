
package com.rental.model;

// This class represents a Truck, a specific type of vehicle.
public class Truck extends Vehicle {

    // Constructor initializes a Truck with its ID, model, and base rental rate.
    public Truck(String vehicleId, String model, double baseRentalRate) {
        // Call the parent class (Vehicle) constructor to set the vehicle's details.
        super(vehicleId, model, baseRentalRate);
    }

    // Overrides the calculateRentalCost method to add a 50% surcharge for trucks.
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.5; // Rental cost = base rate * days * surcharge factor.
    }

    // Overrides the method to check if the truck is available for rental.
    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Uses the availability status from the parent class.
    }

    // Overrides the toString method to provide a custom string representation of the truck.
    @Override
    public String toString() {
        return "Truck [vehicleId=" + getVehicleId() + ", model=" + getModel() + "]";
        // Includes the vehicle ID and model in the output.
    }
}
