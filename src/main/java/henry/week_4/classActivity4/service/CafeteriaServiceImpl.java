package henry.week_4.classActivity4.service;

import henry.week_4.classActivity4.model.Cafeteria;
import henry.week_4.classActivity4.model.Student;
import henry.week_4.classActivity4.model.StudentComparator;


import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService{

    PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();


    public CafeteriaServiceImpl() {
        studentPriorityQueue = new PriorityQueue<>(new StudentComparator());
    }




    @Override
    public void addStudentsToQueue(Student student) {
        studentPriorityQueue.add(student);
    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if(studentPriorityQueue.isEmpty()){
            return "No student is on the queue";
        }

        Student student = studentPriorityQueue.poll();

        return student.getName() + " has taken " + meal.getMealType() + ".";
    }


}
