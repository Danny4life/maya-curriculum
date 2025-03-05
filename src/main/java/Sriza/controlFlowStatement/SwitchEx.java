package Sriza.controlFlowStatement;

public class SwitchEx {

    public static void main(String[] args) {

        int day = 3;

        switch (day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            default:
                System.out.println("Day is not recognized");
        }
    }
}
