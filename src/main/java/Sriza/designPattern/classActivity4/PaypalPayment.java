package Sriza.designPattern.classActivity4;
// Concrete Strategy 1: Paypal Payment
public class PaypalPayment implements PaymentStrategy{

    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);

    }
}
