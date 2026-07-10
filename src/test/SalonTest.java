package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.Appointment;
import main.java.salon.Customer;
import main.java.salon.Employee;
import main.java.salon.Salon;
import main.java.salon.SalonService;


class SalonTest {

    @Test
    void testSalonCreation() {
        Salon salon = new Salon("Beauty Palace");

        assertEquals("Beauty Palace", salon.getSalonName());
        assertTrue(salon.getCustomers().isEmpty());
        assertTrue(salon.getEmployees().isEmpty());
        assertTrue(salon.getServices().isEmpty());
        assertTrue(salon.getAppointments().isEmpty());
    }

    @Test
    void testAddCustomer() {
        Salon salon = new Salon("Beauty Palace");
        Customer customer = new Customer(1, "Happiness", "Masia", "0712345678");

        salon.addCustomer(customer);

        assertEquals(1, salon.getCustomers().size());
    }

    @Test
    void testAddEmployee() {
        Salon salon = new Salon("Beauty Palace");
        Employee employee = new Employee(101, "Sarah", "Smith", "Hair Stylist", "0823456789");

        salon.addEmployee(employee);

        assertEquals(1, salon.getEmployees().size());
    }

    @Test
    void testAddService() {
        Salon salon = new Salon("Beauty Palace");
        SalonService service = new SalonService(1, "Haircut", 250.00, 45);

        salon.addService(service);

        assertEquals(1, salon.getServices().size());
    }

    @Test
    void testAddAppointment() {
        Salon salon = new Salon("Beauty Palace");

        Customer customer = new Customer(1, "Happiness", "Masia", "0712345678");
        Employee employee = new Employee(101, "Sarah", "Smith", "Hair Stylist", "0823456789");
        SalonService service = new SalonService(1, "Haircut", 250.00, 45);

        Appointment appointment = new Appointment(
                1001,
                customer,
                employee,
                service,
                "2026-07-15",
                "10:00"
        );

        salon.addAppointment(appointment);

        assertEquals(1, salon.getAppointments().size());
    }
}