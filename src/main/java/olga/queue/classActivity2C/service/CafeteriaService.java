package olga.queue.classActivity2C.service;

import olga.queue.classActivity2C.model.Cafeteria;
import olga.queue.classActivity2C.model.Student;

public interface CafeteriaService {
    void addStudentsToQueue(Student student);

    String collectMeal(Cafeteria mealTaken);
}
