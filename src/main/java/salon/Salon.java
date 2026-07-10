package main.java.salon;

import java.util.ArrayList;

public class Salon {

    private String salonName;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    private ArrayList<SalonService> services;
    private ArrayList<Appointment> appointments;

    public Salon(String salonName) {
        this.salonName = salonName;
        customers = new ArrayList<>();
        employees = new ArrayList<>();
        services = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public String getSalonName() {
        return salonName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addService(SalonService service) {
        services.add(service);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<SalonService> getServices() {
        return services;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}