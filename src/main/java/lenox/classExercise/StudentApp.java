package lenox.classExercise;

import lenox.classExercise.model.Student;
import lenox.classExercise.service.StudentManager;

import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        String filename = "students.txt";

        manager.loadFromFile(filename);

        while (true) {
            System.out.println("\n********** STUDENT MANAGEMENT SYSTEM **********");
            System.out.println("1. Add new student");
            System.out.println("2. Remove student");
            System.out.println("3. Find student by ID");
            System.out.println("4. Find students by course");
            System.out.println("5. Display all students");
            System.out.println("6. Save & Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student student = new Student(id, name, age, email, course, grade);
                    manager.addStudent(student);
                    break;

                case "2":
                    System.out.print("Enter student ID to remove: ");
                    manager.removeStudent(scanner.nextLine());
                    break;

                case "3":
                    System.out.print("Enter student ID to search: ");
                    Student found = manager.findStudentById(scanner.nextLine());
                    if (found != null) found.displayInfo();
                    else System.out.println("Student not found.");
                    break;

                case "4":
                    System.out.print("Enter course name: ");
                    List<Student> list = manager.findStudentsByCourse(scanner.nextLine());
                    if (list.isEmpty()) System.out.println("No students found for this course.");
                    else list.forEach(Student::displayInfo);
                    break;

                case "5":
                    manager.displayAllStudents();
                    break;

                case "6":
                    manager.saveToFile(filename);
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
