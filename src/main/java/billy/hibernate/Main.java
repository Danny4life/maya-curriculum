package billy.hibernate;

import billy.hibernate.dao.StudentDAO;
import billy.hibernate.entity.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Insert a new Student
        StudentDAO.addStudent("Alice Johnson", "alice@example.com");

        // Fetch all Students
//        List<Student> students = StudentDAO.getStudents();
//        for (Student s : students) {
//            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getEmail());
//        }

        // Update a Student
      //  StudentDAO.updateStudent(1, "Alice James", "alice.james@example.com");

        // Delete a Student
     //   StudentDAO.deleteStudent(1);
    }
}
