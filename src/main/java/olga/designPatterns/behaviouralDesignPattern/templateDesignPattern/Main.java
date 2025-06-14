package olga.designPatterns.behaviouralDesignPattern.templateDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BeverageMaker maker;

        System.out.println("☕ Welcome to the Beverage Maker!");
        System.out.println("Please choose a beverage: ");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                maker = new TeaMaker();
                System.out.println("Making Tea...\n");
                break;
            case 2:
                maker = new CoffeeMaker();
                System.out.println("Making Coffee...\n");
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        maker.makeBeverage();
        System.out.println("\n✅ Your beverage is ready. Enjoy!");

        scanner.close();
    }

}

/**
 * ☕ Welcome to the Beverage Maker!
 * Please choose a beverage:
 * 1. Tea
 * 2. Coffee
 * Enter choice (1 or 2): 2
 *
 * Making Coffee...
 *
 * Boiling water...
 * Dripping coffee through filter...
 * Pouring into cup...
 * Adding sugar and milk...
 *
 * ✅ Your beverage is ready. Enjoy!
 */


/**
 * What's Happening Behind the Scenes?
 * The user picks a drink.
 *
 * The BeverageMaker template method (makeBeverage) runs the full algorithm.
 *
 * Each subclass (tea or coffee) defines custom brew and condiment steps.
 */
