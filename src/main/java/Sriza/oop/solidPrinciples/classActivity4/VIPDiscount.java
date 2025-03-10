package Sriza.oop.solidPrinciples.classActivity4;

public class VIPDiscount implements Discount{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}
