package lenox.classExercise.service;

import lenox.classExercise.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void loadFromFile(String filename) {
        students.clear();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("No existing file found. Starting with an empty list.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String email = parts[3];
                    String course = parts[4];
                    String grade = parts[5];
                    students.add(new Student(id, name, age, email, course, grade));
                }
            }
            System.out.println("Students loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : students) {
                bw.write(s.toString());
                bw.newLine();
            }
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(String studentId) {
        boolean removed = students.removeIf(s -> s.getStudentId().equalsIgnoreCase(studentId));
        if (removed) System.out.println("Student removed.");
        else System.out.println("Student not found.");
    }

    public Student findStudentById(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(studentId)) {
                return s;
            }
        }
        return null;
    }

    public List<Student> findStudentsByCourse(String course) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getCourse().equalsIgnoreCase(course)) {
                result.add(s);
            }
        }
        return result;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.displayInfo();
            }
        }
    }
}
