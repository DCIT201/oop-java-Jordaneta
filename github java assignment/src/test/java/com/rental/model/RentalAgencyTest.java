
package com.rental.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the RentalAgency model using JUnit 5.
public class RentalAgencyTest {
    // Instance of RentalAgency for testing.
    private RentalAgency agency;
    // Test vehicle instance (Car).
    private Vehicle car;
    // Test customer instance.
    private Customer customer;
    // List representing the fleet of vehicles in the rental agency.
    private List<Vehicle> fleet;

    // Runs before each test to set up test data and state.
    @BeforeEach
    void setUp() {
        fleet = new ArrayList<>(); // Initialize a new fleet list.
        car = new Car("C001", "Test Car", 50.0); // Create a test Car instance.
        fleet.add(car); // Add the Car to the fleet.
        agency = new RentalAgency(fleet); // Initialize the RentalAgency with the fleet.
        customer = new Customer("CUST001", "John Doe"); // Create a test Customer instance.
    }

    // Test to verify the fleet is correctly initialized.
    @Test
    void testGetFleet() {
        // Verify that the fleet contains one vehicle.
        assertEquals(1, agency.getFleet().size());
        // Verify that the fleet contains the specific car.
        assertTrue(agency.getFleet().contains(car));
    }

    // Test the process of renting a vehicle.
    @Test
    void testRentVehicle() {
        // Simulate renting the vehicle for 3 days.
        agency.rentVehicle(car, customer, 3);
        // Verify that the car is no longer available.
        assertFalse(car.isAvailable());
        // Verify that the car is added to the customer's rented vehicles list.
        assertTrue(customer.getRentedVehicles().contains(car));
    }

    // Test the process of returning a rented vehicle.
    @Test
    void testReturnVehicle() {
        // Simulate renting and then returning the vehicle.
        agency.rentVehicle(car, customer, 3); // Rent the vehicle.
        agency.returnVehicle(car, customer); // Return the vehicle.
        // Verify that the car is now available.
        assertTrue(car.isAvailable());
        // Verify that the car is removed from the customer's rented vehicles list.
        assertFalse(customer.getRentedVehicles().contains(car));
    }
}
