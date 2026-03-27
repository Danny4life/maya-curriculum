package henry.week_5.classActivity4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("FIVE");


        list.forEach(
                (n) -> System.out.println(n)
        );


    }
}
