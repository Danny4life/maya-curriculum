package olga.classActivity1B;

import java.util.Arrays;

//Pseudocode
//        Define a class: ArrayRemoveEvenNumbers.
//        Step 1
//        Create a method to print all elements of an array:
//        Input: An integer array.
//        Loop through the array and print each element with a space.
//        Move to the next line after printing all elements.
//        Step 2
//        Create a method to remove even integers from an array:
//        Input: An integer array.
//        Count the number of odd integers in the array:
//        Initialize a counter oddNumbers to 0.
//        Loop through the array:
//        If an element is odd (element % 2 != 0), increment the counter.
//        Step 3: Create a new array to store odd integers:
//        Initialize the array result of size oddNumbers.
//        Initialize an index to 0.
//        Step 4: Populate the new array:
//        Loop through the input array:
//        If an element is odd:
//        Add it to the result array at position index.
//        Increment index.
//        Step 5: Return the result array.

public class ArrayRemoveEvenNumbers {

    // Method to print elements of an array
    public static void printArray(int[] arr){
        int n = arr.length;// Get the length of the array

        // Iterate through the array and print each element
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");// Print elements on the same line, separated by a space
        }

        System.out.println(); // Move to the next line after printing all elements

    }

    // Method to remove even numbers from an array
    public static int[] removeEvenIntegers(int[] arr){
        // Counter for the number of odd integers in the array
        int oddNumbersCount = 0;

        // First, count how many odd numbers are in the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){// Check if the number is odd
              oddNumbersCount++;// Increment the odd counter
            }
        }

        // this will help us return only the odd integers
        // Create a new array to hold only the odd numbers
        int[] result = new int[oddNumbersCount];
        // Index to keep track of the current position in the result array
        int index = 0;

        // Populate the result array with odd numbers
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){// If the number is odd
                result[index] = arr[i];// Add it to the result array
                index++;//Move to the next position in the result array
            }
        }
        // Return the array containing only odd numbers
        return result;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 1,3,5,7,9
        System.out.println("Print the original array");
        printArray(arr);

        System.out.println("Print the odd array");
        int[] result = removeEvenIntegers(arr);
        printArray(result);


    }
}
