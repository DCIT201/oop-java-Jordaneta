package com.rental.service;

import com.rental.model.Customer;
import com.rental.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import com.rental.model.RentalTransaction;

// Service class for managing vehicle rentals.
public class RentalService {

    // A list to store all rental transactions (acts as rental history).
    private List<RentalTransaction> rentalRecords = new ArrayList<>();

    // Method to handle renting a vehicle to a customer.
    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        // Check if the vehicle is available for rental.
        if (vehicle.isAvailableForRental()) {
            // Create a new rental transaction if the vehicle is available.
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
            // Add the transaction to the rental records list.
            rentalRecords.add(transaction);
            // Display the total rental cost for the transaction.
            System.out.println("Total Rental Cost: " + transaction.getTotalCost());
        } else {
            // Notify the user if the vehicle is not available.
            System.out.println("Vehicle not available");
        }
    }

    // Method to handle returning a rented vehicle.
    public void returnVehicle(Customer customer, Vehicle vehicle) {
        // Iterate through rental records to find the relevant transaction.
        for (RentalTransaction record : rentalRecords) {
            // Check if the transaction matches the given customer and vehicle.
            if (record.getCustomer().equals(customer) && record.getVehicle().equals(vehicle)) {
                // Mark the vehicle as available for future rentals.
                vehicle.setAvailable(true);
                return; // Exit the method after processing the return.
            }
        }
    }

    // Method to display the history of all rental transactions.
    public void displayRentalHistory() {
        // Loop through each rental transaction and print its details.
        for (RentalTransaction record : rentalRecords) {
            System.out.println(record);
        }
    }
}
