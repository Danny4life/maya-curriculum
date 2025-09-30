package henry.week_3.exception;

public class CustomExcpetionExample {

    public static void checkAge(int age) throws AgeTooLowException{
        if(age < 18){
            throw new AgeTooLowException("Age must be at least 18");
        }

        System.out.println("You are eligible");
    }


    public static void main(String[] args) {

        try {

            checkAge(15);
        } catch (AgeTooLowException e) {
            System.out.println("Custom Exception : " + e.getMessage());
        }
    }


    // 1,1,2,2,3,3,4,4,5,5  ----> 1,2,3,4,5 set
    // 1,1,2,2,3,3,4,4,5,5  --- list
    // K, V = 1, "BOY", 1, "GIRL", 2, "BOY"
}
