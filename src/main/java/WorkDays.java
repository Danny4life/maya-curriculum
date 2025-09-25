public class WorkDays {

    public static void main(String[] args) {

        int day = 6;
        boolean holiday = true;

        if(holiday){
            System.out.println("Wohoo, no work");
        } if (day == 6 || day == 7) {
            System.out.println("Is the weekend");
            
        }else {
            System.out.println("Wake up at 7.00");
        }
    }
}
