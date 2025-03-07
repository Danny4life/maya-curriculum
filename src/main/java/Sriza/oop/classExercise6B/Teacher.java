package Sriza.oop.classExercise6B;

public class Teacher implements TeachAble{
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}
