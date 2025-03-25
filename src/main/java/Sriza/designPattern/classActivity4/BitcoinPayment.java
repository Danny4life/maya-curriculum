package Sriza.designPattern.classActivity4;
// Concrete Strategy 1: Bitcoin Payment
public class BitcoinPayment implements PaymentStrategy{

    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin Wallet: " + walletAddress);

    }
}
