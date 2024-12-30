package com.rental;

import com.rental.model.*;
import com.rental.service.RentalService;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize vehicles with diverse fleet
        Car car1 = new Car("C001", "Toyota Camry", 50.0);
        Car car2 = new Car("C002", "Honda Civic", 45.0);
        Motorcycle bike1 = new Motorcycle("M001", "Honda CBR", 30.0);
        Motorcycle bike2 = new Motorcycle("M002", "Kawasaki Ninja", 35.0);
        Truck truck1 = new Truck("T001", "Ford F-150", 80.0);
        Truck truck2 = new Truck("T002", "Chevrolet Silverado", 85.0);

        // Create and populate fleet
        List<Vehicle> fleet = new ArrayList<>();
        fleet.addAll(Arrays.asList(car1, car2, bike1, bike2, truck1, truck2));
        RentalAgency rentalAgency = new RentalAgency(fleet);

        // Initialize customers
        Customer customer1 = new Customer("CUST001", "Kofi Boakye");
        Customer customer2 = new Customer("CUST002", "Mahama Yussif");
        Customer customer3 = new Customer("CUST003", "Mahamadu Buwumia");

        // Initialize rental service
        RentalService rentalService = new RentalService();

        System.out.println("\n=== Vehicle Rental System Demo ===\n");

        try {
            // Display available vehicles
            System.out.println("Available Vehicles:");
            rentalAgency.displayAvailableVehicles();
            System.out.println();

            // Demonstrate successful rentals
            System.out.println("Processing Rentals:");
            rentalService.rentVehicle(customer1, car1, 3);
            rentalService.rentVehicle(customer2, bike1, 2);
            rentalService.rentVehicle(customer3, truck1, 1);
            System.out.println();

            // // When creating rentals, ensure vehicle is passed:
            // RentalTransaction rental = new RentalTransaction(customer, vehicle, days);

            // Display updated availability
            System.out.println("Updated Vehicle Availability:");
            rentalAgency.displayAvailableVehicles();
            System.out.println();

            // Demonstrate returns
            System.out.println("Processing Returns:");
            rentalService.returnVehicle(customer1, car1);
            rentalService.returnVehicle(customer2, bike1);
            System.out.println();

            // Demonstrate invalid rental (trying to rent already rented vehicle)
            System.out.println("Attempting Invalid Rental:");
            rentalService.rentVehicle(customer1, truck1, 2);

        } catch (Exception e) {
            System.out.println("Error in rental system: " + e.getMessage());
        }

        // Display final rental statistics
        System.out.println("\nFinal Rental Statistics:");
        rentalService.displayRentalHistory();
    }
}