package selahhtin.variableDemo.classActivity5;

import java.util.Scanner;

public class DemoOne {
    public static void main(String[] args) {
        System.out.println("Enter your first name: ");

        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName +  " " + lastName;

        System.out.println("Your full name is " + fullName);
    }
}
