
package com.rental.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the Car model using JUnit 5.
public class CarTest {
    // Instance of the Car class used in the test cases.
    private Car car;

    // Runs before each test to set up a new Car instance.
    @BeforeEach
    void setUp() {
        car = new Car("C001", "Test Car", 50.0); // Initialize the Car with a test ID, model, and rental rate.
    }

    // Test for the calculateRentalCost method.
    @Test
    void testCalculateRentalCost() {
        // Verify that the rental cost is correctly calculated for 3 days.
        assertEquals(150.0, car.calculateRentalCost(3));
    }

    // Test for the availability status of the car.
    @Test
    void testAvailability() {
        // Check the initial availability status of the car.
        assertTrue(car.isAvailableForRental());
        // Change the availability status to false.
        car.setAvailable(false);
        // Verify the updated availability status.
        assertFalse(car.isAvailableForRental());
    }

    // Test for the getter methods of the Car class.
    @Test
    void testGetters() {
        // Verify that the vehicle ID is correctly returned.
        assertEquals("C001", car.getVehicleId());
        // Verify that the model is correctly returned.
        assertEquals("Test Car", car.getModel());
        // Verify that the base rental rate is correctly returned.
        assertEquals(50.0, car.getBaseRentalRate());
    }
}
