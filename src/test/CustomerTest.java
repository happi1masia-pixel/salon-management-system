package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.Customer;

class CustomerTest {

    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer(1, "Happiness", "Masia", "0712345678");

        assertEquals(1, customer.getCustomerId());
        assertEquals("Happiness", customer.getFirstName());
        assertEquals("Masia", customer.getLastName());
        assertEquals("0712345678", customer.getPhoneNumber());
    }

    @Test
    void testSetters() {
        Customer customer = new Customer();

        customer.setCustomerId(2);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setPhoneNumber("0823456789");

        assertEquals(2, customer.getCustomerId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("0823456789", customer.getPhoneNumber());
    }
}