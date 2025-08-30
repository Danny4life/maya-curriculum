package henry.decisionMakingStatement.classActivity3;

public class SwitchStatementEx1 {

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
                System.out.println("Incorrect Number");
        }
    }

    /**
     * create a variable int day and assigned 7 to it
     * then create a switch statement pass in the variable name day as parameter
     * then declare case 1, print out day is Monday, then add your break
     * declare another case 2, print out day is Tuesday, add your break
     * then do the same process up to 7, using wednesday, thursday,friday,saturday and sunday
     */
}
