package selahhtin.examStuffs;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


        int sum = 0;      // Variable to store the sum of numbers
        int count = 0;    // Counter for numbers
        int num = 0;      // Start from 0

        // Using while loop to iterate from 0 to 100
        while (num <= 100) {
            sum += num;  // Add current number to sum
            count++;     // Increase count
            num++;       // Move to the next number
        }

        // Calculate average
        double average = (double) sum / count;

        // Display result
        System.out.println("The average of all numbers between 0 and 100 is: " + average);


//        for (int i = 1; i <= 3; i++) { // outer loop int i = 1; i = 1
//            for (int j = 1; j <= i; j += 2) { // inner loop
//                // System.out.println("Inner");
//                if (i + j >= 2 * j) {
//                    System.out.print(i + "(\t");
//                } else {
//                    System.out.print(j + "\t");
//                    i++;
//                }
//                ///end if else
//                ///end for j:
//                System.out.println();
//                //end for i

        /**
         * first outer loop i = 1
         * i = 1, so the inner loop starts with j = 1
         * inner loop j = 1
         *
         * 1 + 1 >= 2 * 1 -> 2 >= 2 === true
         * output 1
         *
         * second outer loop i = 2
         * i = 2, so the inner loop starts with j = 1
         * inner loop j = 1
         * condition 1 + 1 >= 2 * 1 -> 2 >= 2 ==== true
         * output 2
         *
         * Third outer Loop i = 3
         * i = 3, so the inner loop starts with j = 1
         *inner loop j = 1
         * condition 1 + 1 >= 2 *  1 -> 2 >= 2 == true
         * output 3
         */

    }

        }











//        for (int row = 3; 2 > 0; row--) {// outer for loop -  check for rows -- outer for loop is decrementing
//            for (int col = 1; 2 < 5; col++) { // inner for loop - check for col -- inner for loop is incrementing
//                if (1 >= 3) {
//                    System.out.print(2 % 2 + "(t");
//                } else {
//                    System.out.print(1 % 3 + "(t");
//                }  //Y/end if else
/////end for col;
//                System.out.println("Outer");
//                //  Y//end for col
//
//
//                /**
//                 * after second outer loop row = 1
//                 * after first inner loop col = 3
//                 */
//
//            }
//
//        }


