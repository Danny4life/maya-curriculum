package olga.queue.classActivity2C;

import olga.queue.classActivity2C.enums.MealTypes;
import olga.queue.classActivity2C.model.Cafeteria;
import olga.queue.classActivity2C.model.Student;
import olga.queue.classActivity2C.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Create some sample devs (male and female)
        Student male1 = new Student("Philip Efeonah", false, true);
        Student male2 = new Student("Charles John", false, true);
        Student female1 = new Student("Janefraces Ibeh", true, false);


        // Create a sample meal
        Cafeteria cafeteria = new Cafeteria(MealTypes.FISH_AND_CHIPS);

        // Create a cafeteria impl instance
        CafeteriaServiceImpl cafeteriaService1 = new CafeteriaServiceImpl();


        // Add male and female devs to the cafeteria queue to request for meal
        cafeteriaService1.addStudentsToQueue(male1);
        cafeteriaService1.addStudentsToQueue(male2);
        cafeteriaService1.addStudentsToQueue(female1);



        // Run this after to show philip come first with no priority
        // Add male devs to the cafeteria queue to request for meal
//        CafeteriaServiceImpl cafeteriaService2 = new CafeteriaServiceImpl();
//
//        cafeteriaService2.addStudentsToQueue(male1);
//        cafeteriaService2.addStudentsToQueue(male2);

        // Give out meal

        System.out.println(cafeteriaService1.collectMeal(cafeteria));

//        System.out.println("******Both Males on the queue*******");
//        System.out.println(cafeteriaService2.collectMeal(cafeteria));



    }
}
