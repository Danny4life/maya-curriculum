package kimberly;

public class SimpleIfStatement {

    public static void main(String[] args) {


        int age = 18;

//        if(age < 18){
//            System.out.println("Not eligible to vote");
//        }else {
//            System.out.println("Please enter the right age");
//        }



        if(age < 18){
            System.out.println("Not eligible to vote");
        } else if (age > 18) {
            System.out.println("You are eligible to vote");

        } else if (age >= 18) {
            System.out.println("You are still eligible to vote");

        } else if (age <= 18) {
            System.out.println("You are also eligible to vote");

        }else {
            System.out.println("Please enter the right age");
        }
    }

    /**
     * Using the if else if ladder
     * 1. Declare a variable with data type string and call it city
     * 2. check if the city is equal to Alaska, if true - print the city is Alaska
     * 3. else if, check if the city is equal to Texas, if true - print the city is Texas
     * 4. else if, check if the city is equal to New York, if true print the city is New York
     * 5. if none of the city is true - print city
     */
}
