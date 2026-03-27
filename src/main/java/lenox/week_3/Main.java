package lenox.week_3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student(1, "John", "Doe", "2025", "Male", 19),
                new Student(2, "John", "Doe", "2025", "Male", 19),
                new Student(3, "John", "Doe", "2025", "Male", 19),
                new Student(4, "John", "Doe", "2025", "Male", 19),
                new Student(5, "John", "Doe", "2025", "Male", 19),
        };


        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");
            fw.write("AdmissionId, FirstName, LastName, DOB, Gender, Age\n");
            for(Student student : students){
                fw.write(student.getAdmissionId() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getDob() + ",");
                fw.write(student.getGender() + ",");
                fw.write(student.getAge() + "\n");
            }

            fw.close();

            System.out.println("Student data has been written into the CSV file successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
