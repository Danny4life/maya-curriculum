package olga.designPatterns.creationalDesignPattern.factoryDesign.classActivity2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter vehicle type (car, bike, truck): ");
//        String vehicleType = scanner.nextLine();
//
//        try {
//            Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);  // Factory handles creation
//            vehicle.start();  // Interface method
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        scanner.close();

        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();


        Vehicle truck = VehicleFactory.getVehicle("truck");

        truck.start();
    }
}

/**
 * 🎯 Loose Coupling: Main class only knows about the Vehicle interface.
 *
 * 🛠️ Easy to Extend: Add new vehicle types in factory, no change to main logic.
 *
 * 🔄 Flexible: Easily create vehicles based on dynamic input.
 *
 * most importantly we are not exposing the object creation logic to the main class which is the client,
 * instead we are using a method to create the object
 */
