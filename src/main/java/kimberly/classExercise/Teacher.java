package kimberly.classExercise;

public class Teacher implements TeachAble{

    private String name; // Encapsulation


    @Override
    public void teachCourse(String course) {

        System.out.println("Teaching " + course);
    }
}
