package vinitha.classExercise2;



import vinitha.classExercise.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromStudentCsv {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String filePath = desktopPath + "/students.csv";

        List<Student> students = readStudentFromCsv(filePath);

        for(Student student : students){
            System.out.println(student);
        }
    }




    private static List<Student> readStudentFromCsv(String filePath){
        List<Student> students = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String headerRow = br.readLine();

            String line;

            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                int AdmissionId = Integer.parseInt(data[0]);
                String FirstName = data[1];
                String LastName = data[2];
                String Gender = data[3];
                String DOB = data[4];
                int Age = Integer.parseInt(data[5]);

                Student student = new Student(AdmissionId, FirstName, LastName, Gender, DOB, Age);

                students.add(student);
            }

            br.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        return students;
    }
}
