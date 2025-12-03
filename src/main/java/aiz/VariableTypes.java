package aiz;

public class VariableTypes {



    int sum = 20; // instance variable

    static int mySum = 500; // this is a static variable

    static String NAME_OF_UNIVERSITY= "CIPUTRA";

    static String STUDENT_ID = "AIZ001";


    // Encapsulation -- oop

    public void localVariable(){
        int num1 = 10; // This is a local variable

        int num2 = 30;

        sum = 5000;


        System.out.println(num1 + num2);


    }


    public void fullName(){
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
    }



}
