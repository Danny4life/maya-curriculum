package aiz.abstraction;

public class Teacher extends Person{

    boolean teachCourse = true;

    public Teacher(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    void walk() {

    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mike", 32, 3000);
        System.out.println(teacher.getName() + " " + teacher.getAge() + " " + teacher.salary);
    }
}
