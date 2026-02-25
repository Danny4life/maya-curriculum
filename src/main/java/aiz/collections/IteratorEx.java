package aiz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {


    public static void main(String[] args) {

        List<String> cityName = new ArrayList<>();

        cityName.add("New York");
        cityName.add("Jakarta");
        cityName.add("Lagos");
        cityName.add("London");

        Iterator<String> iterator = cityName.iterator();



        while (iterator.hasNext()){
            String city = iterator.next();

            System.out.println(city);
        }
    }

    // Library --- Introduction to Java
    // Student ----- Introduction to Java
    // Student
}
