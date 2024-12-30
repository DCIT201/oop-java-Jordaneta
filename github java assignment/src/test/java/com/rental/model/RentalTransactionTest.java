
package com.rental.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the RentalTransaction model using JUnit 5.
public class RentalTransactionTest {
    // Instance of RentalTransaction for testing.
    private RentalTransaction transaction;
    // Test customer instance.
    private Customer customer;
    // Test vehicle instance (Car).
    private Vehicle vehicle;

    // Runs before each test to initialize test objects.
    @BeforeEach
    void setUp() {
        customer = new Customer("CUST001", "John Doe"); // Create a test Customer instance.
        vehicle = new Car("C001", "Test Car", 50.0); // Create a test Car instance.
        transaction = new RentalTransaction(customer, vehicle, 3); // Create a RentalTransaction for 3 days.
    }

    // Test to validate the correct creation of a RentalTransaction.
    @Test
    void testTransactionCreation() {
        // Verify that the customer is correctly associated with the transaction.
        assertEquals(customer, transaction.getCustomer());
        // Verify that the vehicle is correctly associated with the transaction.
        assertEquals(vehicle, transaction.getVehicle());
        // Verify that the rental days are set correctly.
        assertEquals(3, transaction.getRentalDays());
        // Verify that the total cost is calculated correctly.
        assertEquals(150.0, transaction.getTotalCost());
        // Verify that the transaction is active upon creation.
        assertTrue(transaction.isActive());
    }

    // Test the completeRental method, which marks the transaction as inactive.
    @Test
    void testCompleteRental() {
        // Complete the rental.
        transaction.completeRental();
        // Verify that the transaction is no longer active.
        assertFalse(transaction.isActive());
    }

    // Test the toString method for the RentalTransaction class.
    @Test
    void testToString() {
        // Expected string representation of the transaction.
        String expected = "RentalTransaction{customer=John Doe, vehicle=Test Car (C001), days=3, cost=150.0, active=true}";
        // Verify that the actual string matches the expected value.
        assertEquals(expected, transaction.toString());
    }
}
