package arraysProgram.reverseArrays;

import java.util.Arrays;

public class ReverseArray {

    int[] arr = {1, 2, 3, 4, 5};

    public int[] reverseArray(){

        for(int i = 0; i < arr.length / 2; i++){
            int t = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1- i] = t;

        }

        return arr;
    }

    public static void main(String[] args) {
        ReverseArray res = new ReverseArray();

        System.out.println(Arrays.toString(res.reverseArray()));
    }
}
