package henry.week_4.classActivity3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person p1 = new Person("John", 30);
        Person p2 = new Person("Bob", 25);
        Person p4 = new Person("Jane", 20);
        Person p3 = new Person("Charlie", 35);



        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);


        Collections.sort(people, new AgeComparator());

        for(Person persons : people){
            System.out.println(persons.getName() + " - " + persons.getAge());
        }
    }
}
