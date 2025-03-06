package Sriza.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine(); // Reads a full line of text

        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.println("Enter Your Height In Meters: ");
        double height = scanner.nextDouble();  // Reads a decimal number

        System.out.println("\nHello, " + name + "! You are " + age + " years old and " + height + "m tall.");

        scanner.close();  // Close scanner to prevent memory leaks
    }
}
