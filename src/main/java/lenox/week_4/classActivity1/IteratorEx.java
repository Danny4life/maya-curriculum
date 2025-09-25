package lenox.week_4.classActivity1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

    public static void main(String[] args) {


        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("Texas");
        cityNames.add("Lagos");
        cityNames.add("Paris");
        cityNames.add("Madrid");


        Iterator<String> iterator = cityNames.iterator();

        while (iterator.hasNext()){
            String city = iterator.next();

            System.out.println(city);

        }
    }
}
