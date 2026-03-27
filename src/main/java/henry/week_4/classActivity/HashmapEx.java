package henry.week_4.classActivity;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {

    public static void main(String[] args) {

        Map<Integer, String> friuts = new HashMap<>();

        friuts.put(1, "Mango");
        friuts.put(1, "Apple");
        friuts.put(2, "Cherry");
        friuts.put(3, "Cherry");
        friuts.put(4, "Strawberry");
        friuts.put(5, "Carrot");



        for(Map.Entry f : friuts.entrySet()){
            System.out.println(f.getKey() + " " + f.getValue());
        }



    }
}
