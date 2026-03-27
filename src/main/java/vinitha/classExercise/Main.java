package vinitha.classExercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {




        Student[] students = {
                new Student(1, "John", "Doe", "MALE", "10/10/1990", 19),
                new Student(2, "Jane", "Doe", "FEMALE", "10/11/1991", 18),
                new Student(3, "Sani", "Dogo", "MALE", "11/11/1992", 20),
                new Student(4, "Chioma", "Nwobi", "FEMALE", "12/10/1990", 17),
                new Student(5, "Vivian", "Abner", "FEMALE", "11/11/1990", 18),
                new Student(6, "Mustapha", "Mohammhed", "MALE", "10/10/1992", 19),
                new Student(7, "Philip", "Aza", "MALE", "9/9/2000", 14),
                new Student(8, "Eve", "Machine", "FEMALE", "10/10/1990", 25),
                new Student(9, "Rice", "Kenny", "MALE", "11/11/1990", 18),
                new Student(9, "Rice", "Kenny", "MALE", "11/11/1990", 18)

        };

        // write student objects into a csv file

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");
            fw.write("AdmissionId, FirstName, LastName, Gender, DOB, Age\n");

            for(Student student : students){
                fw.write(student.getAdmissionNumber() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getGender() + ",");
                fw.write(student.getDob() + ",");
                fw.write(student.getAge() + "\n");
            }

            fw.close();
            System.out.println("Student data has been written into the CSV file successfully");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
