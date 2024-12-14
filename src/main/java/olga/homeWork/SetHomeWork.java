package olga.homeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetHomeWork {
    // Set to store unique student names
    private static Set<String> studentNames = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n--- Student Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Check Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addStudent(scanner);
                case 2 -> removeStudent(scanner);
                case 3 -> checkStudent(scanner);
                case 4 -> displayStudents();
                case 5 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // 1. Add a new student
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name to add: ");
        String name = scanner.nextLine();
        if (studentNames.add(name)) {
            System.out.println("Student added successfully!");
        } else {
            System.out.println("This student is already in the set.");
        }
    }

    // 2. Remove a student
    private static void removeStudent(Scanner scanner) {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();
        if (studentNames.remove(name)) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found in the set.");
        }
    }

    // 3. Check if a student exists
    private static void checkStudent(Scanner scanner) {
        System.out.print("Enter student name to check: ");
        String name = scanner.nextLine();
        if (studentNames.contains(name)) {
            System.out.println("Student is in the set.");
        } else {
            System.out.println("Student is not in the set.");
        }
    }

    // 4. Display all students
    private static void displayStudents() {
        System.out.println("\n--- List of Students ---");
        if (studentNames.isEmpty()) {
            System.out.println("No students in the set.");
        } else {
            System.out.println("Students in the set: " + studentNames);
        }
    }
}
