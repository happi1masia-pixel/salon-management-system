package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.Customer;
import main.java.salon.Payment;

class PaymentTest {

    @Test
    void testPaymentConstructor() {
        Customer customer = new Customer(1, "Happiness", "Masia", "0712345678");

        Payment payment = new Payment(
                1001,
                customer,
                350.00,
                "Cash",
                false
        );

        assertEquals(1001, payment.getPaymentId());
        assertEquals(customer, payment.getCustomer());
        assertEquals(350.00, payment.getAmount());
        assertEquals("Cash", payment.getPaymentMethod());
        assertFalse(payment.isPaid());
    }

    @Test
    void testMakePayment() {
        Customer customer = new Customer(2, "John", "Doe", "0823456789");

        Payment payment = new Payment(
                1002,
                customer,
                500.00,
                "Card",
                false
        );

        payment.makePayment();

        assertTrue(payment.isPaid());
    }

    @Test
    void testSetters() {
        Payment payment = new Payment();

        Customer customer = new Customer(3, "Mary", "Smith", "0834567890");

        payment.setPaymentId(1003);
        payment.setCustomer(customer);
        payment.setAmount(275.50);
        payment.setPaymentMethod("EFT");
        payment.setPaid(true);

        assertEquals(1003, payment.getPaymentId());
        assertEquals(customer, payment.getCustomer());
        assertEquals(275.50, payment.getAmount());
        assertEquals("EFT", payment.getPaymentMethod());
        assertTrue(payment.isPaid());
    }
}