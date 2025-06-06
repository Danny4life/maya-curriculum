package Sriza.designPattern.classActivity4;

// Context Class (Shopping Cart)
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        if(paymentStrategy == null){
            System.out.println("Please select a payment method first!");

            return;

        }

        paymentStrategy.pay(amount);

    }
}
