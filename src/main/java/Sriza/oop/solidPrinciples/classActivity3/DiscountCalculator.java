package Sriza.oop.solidPrinciples.classActivity3;

public class DiscountCalculator {

    /**
     * Imagine we have a DiscountCalculator class that calculates discounts
     * based on different customer types.
     */

    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1; // 10% discount
        } else if (customerType.equals("VIP")) {
            return amount * 0.2; // 20% discount
        }
        else {
            return 0; // No discount
        }
    }
}

class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular Discount: $" + calculator.calculateDiscount("Regular", 100));
        System.out.println("VIP Discount: $" + calculator.calculateDiscount("VIP", 100));
    }

}

/**
 *  What's Wrong?
 * If we add a new customer type (e.g., "Gold Member"), we must modify the DiscountCalculator class.
 * Every time a new type is added, we change existing code, violating OCP.
 * More customer types = More if-else conditions (bad for maintenance).
 */
