package lenox.classExercise.model;

public class Student extends Person{

    private String studentId;
    private String course;
    private String grade;

    public Student(String name, int age, String email) {
        super(name, age, email);
    }


    public Student(String studentId, String name, int age, String email, String course, String grade) {
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------------");

    }

    @Override
    public String toString() {
        return studentId + "," + getName() + "," + getAge() + "," + getEmail() + "," + course + "," + grade;
    }
}
