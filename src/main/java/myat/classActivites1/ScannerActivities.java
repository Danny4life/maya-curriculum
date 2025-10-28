package myat.classActivites1;

import java.util.Scanner;

public class ScannerActivities {


    /**
     * Activity 1: Simple Input
     * Ask for a name and age, then print a sentence.
     */
    public static void simpleInput(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }


    /**
     * Activity 2: Math Input
     * Ask for two numbers and print their sum, difference, and product.
     */
    public static void mathInput(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
    }


    /**
     * Activity 3: Sentence Analyzer
     * Ask for a sentence, print its length and first character.
     */
    public static void sentenceAnalyzer(Scanner sc) {
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int length = sentence.length();
        char firstChar = sentence.charAt(0);

        System.out.println("\nSentence Analysis:");
        System.out.println("Length: " + length);
        System.out.println("First character: '" + firstChar + "'");
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment the one you want to test:
       // simpleInput(sc);
       //  mathInput(sc);
         sentenceAnalyzer(sc);
       // challengeInput(sc);

        sc.close();
    }
}
