package com.rental.model;

/**
 * Defines the contract for objects that can be rented in the vehicle rental system.
 * Classes implementing this interface must provide functionality for renting and returning.
 */
public interface Rentable {
    
    /**
     * Processes the rental of an item to a customer for a specified duration.
     * 
     * @param customer The customer renting the item
     * @param days The number of days for the rental period
     */
    void rent(Customer customer, int days);
    
    /**
     * Handles the return of a previously rented item.
     * This method should update the item's availability status.
     */
    void returnVehicle();
}
