package hamlin.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {

        // get the index and actual value of the array

//        int num[] = {10, 20, 30, 40, 50};
//
//
//        for(int i = 0; i < num.length; i++){
//
//            System.out.println(num[i]);
//
//        }


//        ArrayList<Integer> scores = new ArrayList<>();
//
//        scores.add(10);
//        scores.add(20);
//        scores.add(30);
//        scores.add(40);
//        scores.add(50);
//
//       // scores.remove(1);
//
//
//
//
//        System.out.println(scores);


//        int [][] arr = {
//                {10, 20, 30, 40, 50},
//                {60, 70, 80, 90, 100}
//        };
//
//
//        System.out.println(Arrays.deepToString(arr));



        int arr[] = {1,2,3,4,5};

        int sum = 0;

        for(int i = 1; i <= arr.length; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
