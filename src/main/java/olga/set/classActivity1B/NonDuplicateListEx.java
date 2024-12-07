package olga.set.classActivity1B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicateListEx {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(2);

        System.out.println("Before removing duplicate");
        System.out.println(numberList);

        System.out.println("After removing duplicate");
        Set<Integer> removeDuplicates = new HashSet<>(numberList);

        System.out.println(removeDuplicates);
    }
}
