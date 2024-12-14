package olga.queue.classActivity2C.service.impl;

import olga.queue.classActivity2C.model.Cafeteria;
import olga.queue.classActivity2C.model.Student;
import olga.queue.classActivity2C.model.StudentComparator;
import olga.queue.classActivity2C.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

    PriorityQueue<Student> studentsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        studentsOnQueue = new PriorityQueue<>(new StudentComparator());
    }

    @Override
    public void addStudentsToQueue(Student student) {
        studentsOnQueue.add(student);
    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if (studentsOnQueue.isEmpty()){
            return "No devs is on the queue";
        }

        Student students = studentsOnQueue.poll();



        return students.getName() + " has taken " + meal.getMealType() + ".";

    }

}
