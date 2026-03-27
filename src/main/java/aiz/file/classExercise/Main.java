package aiz.file.classExercise;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // create an array of the student objects

        Student[] students = {
                new Student(1, "John", "Doe", "10/10/1990", "MALE", 19),
                new Student(2, "Jane", "Dede", "10/11/2000", "FEMALE", 16),
                new Student(3, "Sani", "Dogo", "11/2/1994", "MALE", 22),
                new Student(4, "Musa", "Abdul", "12/12/2000", "MALE", 15),
                new Student(5, "Vivian", "Amber", "01/2/2022", "FEMALE", 13)
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
            System.out.println("Student data has been successfully written into a CSV file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
