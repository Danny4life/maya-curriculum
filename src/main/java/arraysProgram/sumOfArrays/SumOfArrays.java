package arraysProgram.sumOfArrays;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfArrays {


//     int[] arr = { 7, 4, 10, 9, 13, 26};
//
//
//
//
//    public  int sumArray() {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//
//        }
//
//        return sum;
//
//    }

    public static void main(String[] args) {


//        int[] arr = { 7, 4, 10, 9, 13, 26};
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//
//        }
//
//
//        System.out.println(sum);

//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(1);
//        arr.add(4);
//        arr.add(10);
//        arr.add(9);
//        arr.add(13);
//        arr.add(26);


//        int sum = 0;
//
//        for(int i = 0; i < arr.size(); i++){
//            sum += arr.get(i);
//
//        }

//        System.out.println(arr.;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original ArrayList: " + numbers);

        // Reverse the ArrayList
        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList: " + numbers);


    }
}
