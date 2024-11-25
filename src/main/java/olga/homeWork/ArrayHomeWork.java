package olga.homeWork;

import java.util.Random;

public class ArrayHomeWork {
    // Task 1: Create an array with random numbers
    public static int[] createArray(){
        Random random = new Random();
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1; // Generate numbers between 1 and 100
        }
        return arr;
    }

    // Task 2: Print the array
    public static void printArray(int[] numbers){
        for(int num : numbers){
            System.out.print(num + " ");
        }

        System.out.println();
    }

    /**
     * Input: An array of numbers, arr.
     * Initialize Variables:
     * Set largest number to the first element of the array (numbers[0]).
     * Set smallest numbers to the first element of the array (numbers[0]).
     * Iterate through the array numbers:
     * For each element num in numbers:
     * Compare with largest:
     * If num is greater than largest, update largest to num.
     * Compare with smallest:
     * If num is smaller than smallest, update smallest to num.
     * Output Results:
     * Print the value of largest.
     * Print the value of smallest.
     * @param numbers
     */

    // Task 3: Find largest and smallest elements
    public static void getTheSmallestAndLargestNumbers(int[] numbers){
        int largestNum = numbers[0];
        int smallestNum = numbers[0];

        for(int num : numbers){
            if(num > largestNum){
                largestNum = num;
            }
            if(num < smallestNum){
                smallestNum = num;
            }
        }
        System.out.println("Largest Number: " + largestNum);
        System.out.println("Smallest Number: " + smallestNum);
    }

    public static void main(String[] args) {
        int[] myArray = createArray();

        // Print the original array
        System.out.println("Original Array:");
        printArray(myArray);

        getTheSmallestAndLargestNumbers(myArray);
    }
}
