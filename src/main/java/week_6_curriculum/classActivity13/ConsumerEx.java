package week_6_curriculum.classActivity13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        // Define a Consumer that prints each name
        Consumer<String> printName = name -> System.out.println(name);

        // Use the forEach method of List to apply the Consumer to each element
        names.forEach(printName);
    }
}
