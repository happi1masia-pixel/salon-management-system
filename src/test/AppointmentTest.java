package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.Appointment;
import main.java.salon.Customer;
import main.java.salon.Employee;
import main.java.salon.SalonService;

class AppointmentTest {

    @Test
    void testAppointmentConstructor() {
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

        assertEquals(1001, appointment.getAppointmentId());
        assertEquals(customer, appointment.getCustomer());
        assertEquals(employee, appointment.getEmployee());
        assertEquals(service, appointment.getService());
        assertEquals("2026-07-15", appointment.getAppointmentDate());
        assertEquals("10:00", appointment.getAppointmentTime());
    }

    @Test
    void testAppointmentSetters() {
        Appointment appointment = new Appointment();

        Customer customer = new Customer(2, "John", "Doe", "0821111111");
        Employee employee = new Employee(102, "Mary", "Brown", "Barber", "0832222222");
        SalonService service = new SalonService(2, "Manicure", 180.00, 30);

        appointment.setAppointmentId(1002);
        appointment.setCustomer(customer);
        appointment.setEmployee(employee);
        appointment.setService(service);
        appointment.setAppointmentDate("2026-08-01");
        appointment.setAppointmentTime("14:30");

        assertEquals(1002, appointment.getAppointmentId());
        assertEquals(customer, appointment.getCustomer());
        assertEquals(employee, appointment.getEmployee());
        assertEquals(service, appointment.getService());
        assertEquals("2026-08-01", appointment.getAppointmentDate());
        assertEquals("14:30", appointment.getAppointmentTime());
    }
}