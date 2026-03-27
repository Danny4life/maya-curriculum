package henry.week_4.classActivity1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String[] args) {

        List<String> citiNames = new ArrayList<>();

        citiNames.add("New York");
        citiNames.add("Lagos");
        citiNames.add("London");
        citiNames.add("Paris");
        citiNames.add("Madrid");


        Iterator<String> iterator = citiNames.iterator();

        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }

    // 20,30,40,50,70 --> 70, 20,30,40,50 -- FIFO
}
