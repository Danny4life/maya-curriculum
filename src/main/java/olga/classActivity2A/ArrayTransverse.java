package olga.classActivity2A;

import java.util.Arrays;

public class ArrayTransverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Elements of the arrays are: " + Arrays.toString(arr));

        // Transverse through the array
        for(int i = 0; i < arr.length; i++){
            System.out.printf("array at index[%d] = %d,  ", i, arr[i]);
            System.out.println();

        }
    }
}
