
package main.java.salon;

public class Payment {

    private int paymentId;
    private Customer customer;
    private double amount;
    private String paymentMethod;
    private boolean paid;

    // Default constructor
    public Payment() {
    }

    // Parameterized constructor
    public Payment(int paymentId, Customer customer, double amount,
                   String paymentMethod, boolean paid) {
        this.paymentId = paymentId;
        this.customer = customer;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paid = paid;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    // Mark payment as completed
    public void makePayment() {
        this.paid = true;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", customer=" + customer +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paid=" + paid +
                '}';
    }
}