package com.rental.model;

/**
 * Represents a Car in the vehicle rental system.
 * Extends the base Vehicle class with car-specific implementations.
 */
public class Car extends Vehicle {

    /**
     * Constructs a new Car instance.
     * 
     * @param vehicleId The unique identifier for the car
     * @param model The model name of the car
     * @param baseRentalRate The daily base rental rate for the car
     */
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    /**
     * Calculates the total rental cost for the specified number of days.
     * 
     * @param days Number of days for rental
     * @return The total rental cost
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    /**
     * Checks if the car is available for rental.
     * 
     * @return true if the car is available, false otherwise
     */
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    /**
     * Returns a string representation of the Car object.
     * 
     * @return String containing the car's ID and model
     */
    @Override
    public String toString() {
        return "Car [vehicleId=" + getVehicleId() + ", model=" + getModel() + "]";
    }
}
