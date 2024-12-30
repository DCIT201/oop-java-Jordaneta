
package com.rental.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the Customer model using JUnit 5.
public class CustomerTest {
    // Test customer instance.
    private Customer customer;
    // Test vehicle instance.
    private Vehicle vehicle;

    // Runs before each test to initialize common test objects.
    @BeforeEach
    void setUp() {
        customer = new Customer("CUST001", "John Doe"); // Initialize a Customer with ID and name.
        vehicle = new Car("C001", "Test Car", 50.0); // Initialize a Vehicle (Car in this case) for testing.
    }

    // Test for the rentVehicle method.
    @Test
    void testRentVehicle() {
        // Simulate the customer renting a vehicle.
        customer.rentVehicle(vehicle);
        // Verify that the rented vehicle is added to the customer's rented vehicles list.
        assertEquals(1, customer.getRentedVehicles().size());
        assertTrue(customer.getRentedVehicles().contains(vehicle));
    }

    // Test for the returnVehicle method.
    @Test
    void testReturnVehicle() {
        // Simulate the customer renting and then returning a vehicle.
        customer.rentVehicle(vehicle); // Rent the vehicle.
        customer.returnVehicle(vehicle); // Return the vehicle.
        // Verify that the vehicle is removed from the rented vehicles list.
        assertEquals(0, customer.getRentedVehicles().size());
        assertFalse(customer.getRentedVehicles().contains(vehicle));
    }

    // Test for the getter methods of the Customer class.
    @Test
    void testGetters() {
        // Verify that the customer ID is correctly returned.
        assertEquals("CUST001", customer.getCustomerId());
        // Verify that the customer name is correctly returned.
        assertEquals("John Doe", customer.getName());
    }
}
