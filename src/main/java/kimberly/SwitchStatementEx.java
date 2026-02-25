package kimberly;

public class SwitchStatementEx {

    public static void main(String[] args) {


        int num = 2;

        switch (num){

            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("None of the number is correct");
        }
    }


    /**
     * Using switch statement, declare a variable Monday of type string
     * then create your switch statement and check for each days of the week as a case
     * for instance check if case is monday, tuesday, wednesday, thursday, friday, saturday, sunday
     * then don't forget your default statement, just in case all your cases are false
     */
}
