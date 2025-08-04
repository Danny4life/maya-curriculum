package olga.designPatterns.creationalDesignPattern.factoryDesign.classActivity1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter vehicle type (car, bike, truck): ");
//        String type = scanner.nextLine().toLowerCase();
//
//        Vehicle vehicle;
//
//        // ❌ Object creation is done here directly, using if-else logic
//        if (type.equals("car")) {
//            vehicle = new Car();
//        } else if (type.equals("bike")) {
//            vehicle = new Bike();
//        } else if (type.equals("truck")) {
//            vehicle = new Truck();
//        } else {
//            throw new IllegalArgumentException("Unknown vehicle type");
//        }
//
//        // ✅ Vehicle behavior is still polymorphic
//        vehicle.start();
//
//        scanner.close();


        // Here the client knows the exact class name such as car, bike, truck
        Car car = new Car();         // Direct instantiation
        car.start();

        Bike bike = new Bike();      // Direct instantiation
        bike.start();

        Truck truck = new Truck();
        truck.start();
    }
}

/**
 * Problems with This Approach:
 * ❌ 1. Tight Coupling
 * Main class depends directly on Car and Bike.
 * If we later want to switch to Truck or Scooter, we must modify the Main class by creating a new instance of the class.
 *
 * ❌ 2. No Flexibility
 * We can't choose the vehicle type at runtime (e.g., based on user input or configuration).
 *
 * ❌ 3. Hard to Extend
 * Adding new vehicle types means editing multiple places: the main class and probably other logic as well.
 */
