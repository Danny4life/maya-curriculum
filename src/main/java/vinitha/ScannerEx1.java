package vinitha;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guessNumber = 0;

        while (guessNumber != 7){
            System.out.println("Guess the number again: ");

            guessNumber = scanner.nextInt();
        }

        System.out.println("CORRECT GUESS");
    }
}
