package jug.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableEx {

    public static void main(String[] args) {


        List<String> citiNames = new ArrayList<>();


        citiNames.add("Benin");
        citiNames.add("Ikeja");
        citiNames.add("Awka");
        citiNames.add("Kano");
        citiNames.add("Calabar");


        Iterator<String> i = citiNames.iterator();

        while (i.hasNext()){
            String city = i.next();

            System.out.println(city);
        }
    }
}
