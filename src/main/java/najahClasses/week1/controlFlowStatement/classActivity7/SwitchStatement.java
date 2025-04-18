package najahClasses.week1.controlFlowStatement.classActivity7;

public class SwitchStatement {


    /**
     *
     * @param args
     *
     * using switch statement create a simple calendar
     * STEP 1 - create variable and call it day, assigned 3 to the variable, your variable
     * should be of type int.
     * STEP 2 - Create your switch syntax and check for case 1, if true print out the string Monday
     *  then do the same for the rest of the days of the week
     *  LAST STEP - set your default to the string "Not a day"
     */

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
            default:


        }
    }
}
