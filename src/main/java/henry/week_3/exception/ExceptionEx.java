package henry.week_3.exception;

public class ExceptionEx {

    public static void main(String[] args) {

        String name = "";

        try{
            int num = 10 / 0;
            System.out.println("Please print me");
        } catch (Exception ex) {
            System.out.println("You can't divide by zero");
        }finally {
            System.out.println("This block should always run, no matter what happens");
        }



//        int num = 10 / 0;
//
//        System.out.println(num);
//
//        System.out.println("This block should always run, no matter what happens");


    }

}
