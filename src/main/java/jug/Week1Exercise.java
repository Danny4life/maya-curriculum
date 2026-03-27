package jug;

import java.util.Scanner;

public class Week1Exercise {

    // Method 1: Add two numbers
    public static void addTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Result: " + sum);
    }

    // Method 2: Check if number is EVEN or ODD using ternary operator
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is " + result);
    }

    // Method 3: Print numbers from 1 to N using for loop
    public static void printNumbers(Scanner scanner) {
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Method 4: Display day of the week using switch statement
    public static void displayDayOfWeek(Scanner scanner) {
        System.out.print("Enter a number (1 - 7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;

        // Menu loop using do-while
        do {
            System.out.println("\n===== STUDENT UTILITY APP =====");
            System.out.println("1. Add two numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                addTwoNumbers(scanner);
            } else if (choice == 2) {
                checkEvenOrOdd(scanner);
            } else if (choice == 3) {
                printNumbers(scanner);
            } else if (choice == 4) {
                displayDayOfWeek(scanner);
            } else if (choice == 5) {
                System.out.println("Thank you for using the app!");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (running);

        scanner.close();
    }
}
