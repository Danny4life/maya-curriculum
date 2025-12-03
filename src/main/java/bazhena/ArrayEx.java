package bazhena;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {


//        int []num = new int[5];  // this array can only contain 5 items or numbers
//
//        num[0] = 10;
//        num[1] = 20;
//        num[2] = 30;
//        num[3] = 40;
//        num[4] = 50;
//        num[5] = 60;




        // for-each loop

//        for(int i : num){
//            System.out.println(i);
//        }



        // to get the length of an array
//        int arrayLenght = num.length;
//
//        System.out.println(arrayLenght);



        // 10 * 20 * 30 * 40 * 50 = 150

//        int sum = 0; // temp variable to hold each array number while running the loop
//
//        for (int i = 0; i < num.length; i++){
//            sum += num[i]; // addition and assignment
//
////            0 += 10;
////
////            10 += 20;
//
//            // 0 + 10
//            // 10 + 20 = 30
//            // 30 + 30 = 60
//            // 60 + 40 = 100
//            // 100 + 50 = 150
//        }


//

        int[] num = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(new int[]{num[4]}));

    }
}
