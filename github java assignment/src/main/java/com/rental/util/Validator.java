package com.rental.util;

import com.rental.model.Customer;
import com.rental.model.Vehicle;

// Utility class for validating rental-related data.
public class Validator {

    // Validates whether the number of rental days is positive.
    public static boolean isValidRentalDays(int days) {
        return days > 0; // Rental days must be greater than 0 to be valid.
    }

    // Validates whether the provided vehicle is non-null.
    public static boolean isValidVehicle(Vehicle vehicle) {
        return vehicle != null; // A valid vehicle must not be null.
    }

    // Validates whether the provided customer is non-null.
    public static boolean isValidCustomer(Customer customer) {
        return customer != null; // A valid customer must not be null.
    }
}
