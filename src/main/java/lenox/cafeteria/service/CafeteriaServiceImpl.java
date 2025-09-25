package lenox.cafeteria.service;

import lenox.cafeteria.model.Cafeteria;
import lenox.cafeteria.model.StudentComparator;
import lenox.cafeteria.model.Students;
import olga.queue.classActivity2C.model.Student;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl {

    PriorityQueue<Students> studentOnQueue = new PriorityQueue<>();


    public CafeteriaServiceImpl() {
        studentOnQueue = new PriorityQueue<>(new StudentComparator());
    }

    public void addStudentToQueue(Students students){
        studentOnQueue.add(students);
    }

    public String collectMeal(Cafeteria meal){

        if(studentOnQueue.isEmpty()){
            return "No students on queue";

        }
        Students students = studentOnQueue.poll();

        return students.getName() + " has collected " + meal.getMealType() + ".";
    }
}
