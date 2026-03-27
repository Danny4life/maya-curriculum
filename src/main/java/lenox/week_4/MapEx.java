package lenox.week_4;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

    public static void main(String[] args) {



        Map<Integer, String> friuts = new HashMap<>();



        friuts.put(1, "Mango");
        friuts.put(2, "Strawberry");
        friuts.put(3, "Cherry");
        friuts.put(3, "Banana");
        friuts.put(4, "Mango");



        for(Map.Entry f : friuts.entrySet()){
            System.out.println(f.getKey() + " " + f.getValue());

        }

    }
}
