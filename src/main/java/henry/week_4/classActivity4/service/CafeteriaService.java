package henry.week_4.classActivity4.service;

import henry.week_4.classActivity4.model.Cafeteria;
import henry.week_4.classActivity4.model.Student;



public interface CafeteriaService {

    void addStudentsToQueue(Student student);


    String collectMeal(Cafeteria meal);
}
