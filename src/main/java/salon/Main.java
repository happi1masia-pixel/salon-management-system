package main.java.salon;

public class Main {

    public static void main(String[] args) {

        Salon salon = new Salon("Beauty Palace");

        Customer customer = new Customer(
                1,
                "Happiness",
                "Masia",
                "0712345678"
        );

        Employee employee = new Employee(
                101,
                "Sarah",
                "Smith",
                "Hair Stylist",
                "0823456789"
        );

        SalonService service = new SalonService(
                1,
                "Haircut",
                250.00,
                45
        );

        Appointment appointment = new Appointment(
                1001,
                customer,
                employee,
                service,
                "2026-07-15",
                "10:00"
        );

        Payment payment = new Payment(
                5001,
                customer,
                service.getPrice(),
                "Card",
                false
        );

        salon.addCustomer(customer);
        salon.addEmployee(employee);
        salon.addService(service);
        salon.addAppointment(appointment);

        payment.makePayment();

        System.out.println("=== Salon Management System ===");
        System.out.println("Salon: " + salon.getSalonName());
        System.out.println(customer);
        System.out.println(employee);
        System.out.println(service);
        System.out.println(appointment);
        System.out.println(payment);
    }
}