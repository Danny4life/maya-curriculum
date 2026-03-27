package vinitha.controFlowStatement;

public class SwitchStatement {

    public static void main(String[] args) {

        int daysOfTheWeek = 1;


        switch (daysOfTheWeek){

            case 1:
                System.out.println("HALLOWEN");
                break; // Jump statement
            case 2:
                System.out.println("INDEPENDENCE DAY");
                break;
            case 3:
                System.out.println("XMAS DAY");
                break;
            case 4:
                System.out.println("NEW YEAR DAY");
                break;
            case 5:
                System.out.println("SNOW DAY");
                break;
            case 6:
                System.out.println("HARMMATHAN DAY");
                break;
            case 7:
                System.out.println("JUDGEMENT DAY");
                break;
            default:
                System.out.println("HOLIDAY");
        }
    }
}
