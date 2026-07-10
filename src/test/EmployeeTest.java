package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.Employee;

class EmployeeTest {

    @Test
    void testEmployeeConstructor() {
        Employee employee = new Employee(
                101,
                "Sarah",
                "Smith",
                "Hair Stylist",
                "0712345678"
        );

        assertEquals(101, employee.getEmployeeId());
        assertEquals("Sarah", employee.getFirstName());
        assertEquals("Smith", employee.getLastName());
        assertEquals("Hair Stylist", employee.getRole());
        assertEquals("0712345678", employee.getPhoneNumber());
    }

    @Test
    void testEmployeeSetters() {
        Employee employee = new Employee();

        employee.setEmployeeId(102);
        employee.setFirstName("John");
        employee.setLastName("Brown");
        employee.setRole("Barber");
        employee.setPhoneNumber("0823456789");

        assertEquals(102, employee.getEmployeeId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Brown", employee.getLastName());
        assertEquals("Barber", employee.getRole());
        assertEquals("0823456789", employee.getPhoneNumber());
    }

    @Test
    void testToString() {
        Employee employee = new Employee(
                103,
                "Mary",
                "Jones",
                "Nail Technician",
                "0834567890"
        );

        String result = employee.toString();

        assertTrue(result.contains("Mary"));
        assertTrue(result.contains("Jones"));
        assertTrue(result.contains("Nail Technician"));
    }
}