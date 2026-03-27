package hamlin.exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exams {

    public static void mystery(List<Integer> nums) {
        for (int k = 0; k < nums.size(); k++) {
            if (nums.get(k).intValue() == 0) {
                nums.remove(k);
            }
        } }

    public static void main(String[] args) {



//        for(int k = 0; k < 20; k = k + 2){
//            if(k % 3 == 0){
//                System.out.printf(k + " ");
//            }
//        }

        // -> 0 6 12 18



//        List<String> animals = new ArrayList<String>();
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("snake");
//        animals.set(2,"lizard");
//        animals.add(1,"fish");
//        animals.remove(3);
//        System.out.println(animals);

        // ans -> [dog, fish, cat]



//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(0);
//        list.add(4);
//        list.add(2);
//        list.add(5);
//        list.add(0);
//        list.add(3);
//        list.add(0);
//
//        System.out.println("Before: " + list);
//        mystery(list);
//        System.out.println("After:  " + list);

        // -> [0, 4, 2, 5, 3]

    }




}
