package Sriza.designPattern.classActivity4;

// Concrete Strategy 1: Credit Card Payment
public class CreditCardPayment implements PaymentStrategy{

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + creditCardNumber);

    }
}
