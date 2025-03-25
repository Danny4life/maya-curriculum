package Sriza.designPattern.classActivity4;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Paying with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Paying with PayPal
        cart.setPaymentStrategy(new PaypalPayment("user@example.com"));
        cart.checkout(50);

        // Paying with Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6F7g8H9"));
        cart.checkout(75);
    }
}
