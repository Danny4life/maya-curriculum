package classActivity2;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your fullname: ");
        String fullName = scanner.nextLine(); // Read a full line of text

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        // Prompt the user for their favorite number
        System.out.print("Enter your favorite number: ");
        double favoriteNumber = scanner.nextDouble(); // Read a double (for decimals)

        // Print the collected data
        System.out.println("\nThank you, " + fullName + "!");
        System.out.println("You are " + age + " years old, and your favorite number is " + favoriteNumber + ".");

        // Close the scanner
        scanner.close();
    }
}
