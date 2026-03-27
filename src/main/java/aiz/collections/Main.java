package aiz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person p3 = new Person("Abdul", 35);
        Person p1 = new Person("John", 30);
        Person p4 = new Person("Baby", 20);
        Person p2 = new Person("Bob", 25);





        // FIFO -- First In First Out

        // Male, Male, Female
        // chips


        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

       Collections.sort(people, new AgeComparator());

        for(Person person : people){
            System.out.println(person.getName() + " _ " + person.getAge());
        }


    }

}
