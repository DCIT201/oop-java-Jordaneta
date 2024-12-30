package com.rental.model;

// Abstract class representing a generic vehicle.
public abstract class Vehicle {
    // Unique identifier for the vehicle.
    private String vehicleId;
    // Model name or description of the vehicle.
    private String model;
    // Base rental rate for the vehicle (daily).
    private double baseRentalRate;
    // Availability status of the vehicle.
    private boolean isAvailable;

    // Constructor to initialize a vehicle with its ID, model, and base rental rate.
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId; // Assign the vehicle ID.
        this.model = model; // Assign the vehicle model.
        this.baseRentalRate = baseRentalRate; // Assign the base rental rate.
        this.isAvailable = true; // Default availability is true.
    }

    // Getter for the vehicle ID.
    public String getVehicleId() {
        return vehicleId;
    }

    // Setter for the vehicle ID.
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    // Getter for the model of the vehicle.
    public String getModel() {
        return model;
    }

    // Setter for the vehicle model.
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for the base rental rate.
    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    // Setter for the base rental rate with validation.
    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) { // Ensure the rate is non-negative.
            throw new IllegalArgumentException("Base rental rate cannot be negative");
        }
        this.baseRentalRate = baseRentalRate;
    }

    // Getter for the availability status.
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for the availability status.
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Getter for the ID, alias for vehicleId.
    public String getId() {
        return vehicleId; // Returns vehicleId (the unused `id` field is commented out).
    }

    // Abstract method to calculate the rental cost. Subclasses must provide implementation.
    public abstract double calculateRentalCost(int days);

    // Abstract method to check rental availability. Subclasses must provide implementation.
    public abstract boolean isAvailableForRental();
}
