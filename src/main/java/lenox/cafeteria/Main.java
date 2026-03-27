package lenox.cafeteria;

import lenox.cafeteria.enums.MealType;
import lenox.cafeteria.model.Cafeteria;
import lenox.cafeteria.model.Students;
import lenox.cafeteria.service.CafeteriaServiceImpl;

public class Main {

    public static void main(String[] args) {

        Students male = new Students("John", false, true);
        Students female = new Students("Jane", true, false);


        Cafeteria cafeteria = new Cafeteria(MealType.CHICKEN_CHIPS);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        cafeteriaService.addStudentToQueue(male);
        cafeteriaService.addStudentToQueue(female);


        System.out.println(cafeteriaService.collectMeal(cafeteria));






    }
}
