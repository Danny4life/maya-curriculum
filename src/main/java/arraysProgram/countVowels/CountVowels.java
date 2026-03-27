package arraysProgram.countVowels;

public class CountVowels {
    public static void main(String[] args) {
        String str = "hello world";   // Input string
        int count = 0;                // To keep track of vowel count

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        str = str.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Print the result
        System.out.println("Input: " + str);
        System.out.println("Number of vowels: " + count);
    }
}
