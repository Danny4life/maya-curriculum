package Sriza.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // Reads a full line

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());  // Converts String to int

        System.out.print("Enter your height in meters: ");
        double height = Double.parseDouble(reader.readLine());  // Converts String to double

        System.out.println("\nHello, " + name + "! You are " + age + " years old and " + height + "m tall.");
    }
}
