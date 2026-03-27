package christian.exception;

public class JavaExceptionEx {

    public static void main(String[] args) {


        try{
            int num = 500 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Run other part of the program....");
        }


        // throw, throws

    }
}
