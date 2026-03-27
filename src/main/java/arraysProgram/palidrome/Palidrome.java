package arraysProgram.palidrome;

public class Palidrome {

    public static void main(String[] args) {
        String str = "madam";  // Input string

        // Convert the string to lowercase (optional for case-insensitive check)
        str = str.toLowerCase();

        // Create a reversed version of the string
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Compare the original and reversed strings
        boolean isPalindrome = str.equals(reversed);

        // Print the result
        System.out.println("Input: " + str);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
