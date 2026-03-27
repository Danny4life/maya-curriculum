package bazhena;

import java.util.Arrays;

public class RotateArrayOne {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        // {2,3,4,5,1}

        // Store the first element

        int first = arr[0]; // 1

        // Shift all elements to the left
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];  // 2,3,4,5
        }

        // Move the first element 1 to the end
        arr[arr.length - 1] = first;  // 2,3,4,5,1

        // Display the result
        for(int result : arr){
            System.out.print(result + " ");
        }





    }
}
