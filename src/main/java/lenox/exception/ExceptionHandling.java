package lenox.exception;

public class ExceptionHandling {

    public static void main(String[] args) {


        try{
            int result = 10 / 0;


        } catch (Exception e) {

            System.out.println("Please i need you to also read me");
            throw new RuntimeException(e);

        }

    }
}
