package week_6_curriculum.classActivity5A;

import java.util.ArrayList;
import java.util.List;

public class Pyramid {
    public static void main(String[] args) {
        List<String> pyramid = new ArrayList<>();

        pyramid.add("*****");
        pyramid.add("****");
        pyramid.add("**");
        pyramid.add("*");
        pyramid.add("***");
        pyramid.add("******");


        // Sorting pyramid based on their lengths using Comparator with lambda
        pyramid.sort((py1, py2) -> Integer.compare(py1.length(), py2.length()));

        // we are using comparingInt because it is an integer, if it is a string we will be using Comparator.comparing(Type :: parameter)
        // fruits.sort(Comparator.comparingInt(String::length));



        pyramid.forEach(
                (p) -> System.out.println(p)
        );
    }
}
