package week_6_curriculum.classActivity12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicteEx {
    public static void main(String[] args) {
        List<Integer> evenOrOdd = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Example Predicate: Test if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Test if numbers are even using Predicate
        System.out.println("Even Numbers:");

        evenOrOdd.forEach(num -> {
            if(isEven.test(num)){
                System.out.println(num);
            }
        });
    }
}
