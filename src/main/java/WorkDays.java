public class WorkDays {

    //int num = 200936278123; // This is primitive -- it can only store small collection of data

    Long num2 = 200936278123L; // This is non - primitive -- it can store large collection of data

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;

        System.out.println( (double) num1/num2);

        double a = 9.2;
        System.out.println("Before casting " + a);

        int b = (int) a;

        System.out.println("After casting " + b);
    }
}
