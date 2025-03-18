package jay.classTask;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {  // Loop from 1 to 20
            if (i % 3 == 0 && i % 5 == 0) {  // Check if divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {  // Check if divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {  // Check if divisible by 5
                System.out.println("Buzz");
            } else {  // Print the number if none of the conditions match
                System.out.println(i);
            }
        }
    }
}
