package jay.classExercise2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number (1-7) or a day name (Monday-Sunday): ");

        // tell jay to use google to Check if the input is an integer
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            switch (dayNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
        // If not an integer, assume it's a string (day name)
        else {
            String dayName = scanner.next().toLowerCase(); // Convert to lowercase for case insensitivity
            switch (dayName) {
                case "monday" -> System.out.println("Day number: 1");
                case "tuesday" -> System.out.println("Day number: 2");
                case "wednesday" -> System.out.println("Day number: 3");
                case "thursday" -> System.out.println("Day number: 4");
                case "friday" -> System.out.println("Day number: 5");
                case "saturday" -> System.out.println("Day number: 6");
                case "sunday" -> System.out.println("Day number: 7");
                default -> System.out.println("Invalid input. Please enter a valid day name.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
