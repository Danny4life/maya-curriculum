package olga.classActivity1C;

/** to solve reverse array is basically swapping the numbers between a start index and an end index
 * 1. we need a start index and an end index value
 * 2. the start index value will reference the index of the first number in the array
 * 3. while the end index value will reference the index and the last number in the array
 * 4. then we check if start index is less than end index
 * 5. if true, then we assigned the number at start index to a temporarily variable
 * 6. then we assigned the number at the start index to the number at the end index
 * 7. then we assigned the number at the end index to the temporarily variable
 * 8. then we increment the start index value by 1, and decrement the end index value by 1
 */


/**
 * reverseArr(int numbers[], int startIndex, int endIndex){
 *     while(startIndex < endIndex){
 *         int temp = numbers[startIndex];
 *         numbers[startIndex] = numbers[endIndex];
 *         numbers[endIndex] = temp;
 *         startIndex++;
 *         endIndex--;
 *     }
 * }
 * {2,4,6,8,10,12}  ------> {12,10,8,6,4,2}
 *  0,1,2,3,4,5
 */

/**
 * explain the logic
 * reverseArray(numbers, 0, numbers.length - 1)
 * start index value = 0
 * end index value= 5
 * start and end index serves as the range we are going to use to reverse the array
 * temp = 2  -- stores the number at start index
 * numbers[0] 2 = numbers[5] 12
 * numbers[5] 12 = temp 2  --- at this point we have swap the numbers
 * then we increment the start index by 1 and decrement the end index by 1 and keep repeating the
 * process until start index is no longer less that end index, then we break out of the loop
 */

public class ReverseArray {

    public static void printArray(int[] arr){
        int n = arr.length;// Get the length of the array

        // Iterate through the array and print each element
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");// Print elements on the same line, separated by a space
        }

        System.out.println(); // Move to the next line after printing all elements

    }

    public static void reverseArray(int[] numbers, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = numbers[startIndex];
            numbers[startIndex] = numbers[endIndex];
            numbers[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }


    public static void main(String[] args) {
        // do this first and run the code
        int[] numbers = {2,4,6,8,10,12};
        printArray(numbers);

        reverseArray(numbers, 0, numbers.length - 1);
        printArray(numbers);
    }
}
