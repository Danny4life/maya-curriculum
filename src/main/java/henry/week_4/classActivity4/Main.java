package henry.week_4.classActivity4;

import henry.week_4.classActivity4.model.Cafeteria;
import henry.week_4.classActivity4.model.Student;
import henry.week_4.classActivity4.service.CafeteriaServiceImpl;
import lenox.cafeteria.enums.MealType;

public class Main {
    public static void main(String[] args) {

        Student male1 = new Student("Philip", false, true);
        Student female1 = new Student("Jane", true, false);

        Cafeteria cafeteria = new Cafeteria(MealType.CHICKEN_CHIPS);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        cafeteriaService.addStudentsToQueue(male1);
        cafeteriaService.addStudentsToQueue(female1);


        System.out.println(cafeteriaService.collectMeal(cafeteria));
    }
}
