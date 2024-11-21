package classActivity1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter your name ");

        // Read a full line of text
        String name = sc.nextLine();

        // Print the collected data
        System.out.println("Hello " + name);

        // Close the scanner
        sc.close();
    }
}
