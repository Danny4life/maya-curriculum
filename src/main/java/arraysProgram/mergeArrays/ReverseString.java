package arraysProgram.mergeArrays;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {

        String str = "hello";
        String reversed = "";

        // Loop from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
