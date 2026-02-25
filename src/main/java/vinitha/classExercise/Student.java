package vinitha.classExercise;

public class Student {

    int admissionNumber;

    String firstName;

    String lastName;

    String gender;

    String dob;

    int age;

    public Student(int admissionNumber, String firstName, String lastName, String gender, String dob, int age) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNumber=" + admissionNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                '}';
    }
}
