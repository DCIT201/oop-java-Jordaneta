
package com.rental.model;

import com.rental.util.Validator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the Validator utility class using JUnit 5.
public class ValidatorTest {
    
    // Test the validation logic for rental days.
    @Test
    void testValidRentalDays() {
        // Test with a valid rental day (1 day).
        assertTrue(Validator.isValidRentalDays(1)); // Expected: true, because 1 day is valid.
        // Test with another valid rental day (5 days).
        assertTrue(Validator.isValidRentalDays(5)); // Expected: true, because 5 days is valid.
        // Test with zero rental days (invalid).
        assertFalse(Validator.isValidRentalDays(0)); // Expected: false, because rental days must be greater than 0.
        // Test with negative rental days (invalid).
        assertFalse(Validator.isValidRentalDays(-1)); // Expected: false, because rental days cannot be negative.
    }
}
