package com.rental.model;

/**
 * Represents a Motorcycle in the vehicle rental system.
 * Extends the base Vehicle class with motorcycle-specific implementations.
 * Motorcycles receive a 20% discount on the base rental rate.
 */
public class Motorcycle extends Vehicle {

    /**
     * Constructs a new Motorcycle instance.
     * 
     * @param vehicleId The unique identifier for the motorcycle
     * @param model The model name of the motorcycle
     * @param baseRentalRate The daily base rental rate for the motorcycle
     */
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    /**
     * Calculates the total rental cost for the specified number of days.
     * Applies a 20% discount to the base rental rate.
     * 
     * @param days Number of days for rental
     * @return The discounted total rental cost
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.8; // Motorcycle has a 20% discount
    }

    /**
     * Checks if the motorcycle is available for rental.
     * 
     * @return true if the motorcycle is available, false otherwise
     */
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    /**
     * Returns a string representation of the Motorcycle object.
     * 
     * @return String containing the motorcycle's ID and model
     */
    @Override
    public String toString() {
        return "Motorcycle [vehicleId=" + getVehicleId() + ", model=" + getModel() + "]";
    }
}
