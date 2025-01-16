package erica.classActivity2C;

public class Student {

    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // comment out the constructor and remove the values to show default values
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");
        Student s3 = new Student(3, "Sam");

        s1.display();
        s2.display();
        s3.display();
    }
}
