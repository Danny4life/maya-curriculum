package Sriza.oop.solidPrinciples.classActivity4;

import org.hibernate.query.criteria.JpaSearchedCase;

public class Main {

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Discount regularDiscount = new RegularDiscount();
        Discount vipDiscount = new VIPDiscount();

        System.out.println("Regular Discount: $" + calculator.calculateDiscount(regularDiscount, 100));
        System.out.println("VIP Discount: $" + calculator.calculateDiscount(vipDiscount, 100));
    }
}

/**
 * What’s the Benefit?
 * ✅ We can add new discount types (e.g., "GoldMemberDiscount") without modifying DiscountCalculator.
 * ✅ No more if-else conditions—each discount type is a separate class.
 * ✅ Code is easy to maintain and scalable.
 */
