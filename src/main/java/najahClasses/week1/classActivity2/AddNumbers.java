package najahClasses.week1.classActivity2;

import java.util.Scanner;

public class AddNumbers {


    public static void main(String[] args) {

//        int num1 = 25;
//        int num2 = 25;
//
//        int addNum = num1 + num2;
//
//        System.out.println(addNum);

        System.out.println("Enter your first number: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();

        int addNumbers = num1 + num2;

        System.out.println(num1 + " + " + num2 + " is = " + addNumbers);



        Long mynum = 100L;

        boolean name = true;

        char c = 'A';


    }
}
