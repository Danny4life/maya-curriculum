package lenox.queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();



        Person p1 = new Person("John", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Charlie", 35);
        Person p4 = new Person("Baby", 20);


        people.add(p1);
        people.add(p4);
        people.add(p2);
        people.add(p3);


        Collections.sort(people, new AgeComparator());

        for(Person person : people){
            System.out.println(person.getName() + " - " + person.getAge());

        }
    }
}
