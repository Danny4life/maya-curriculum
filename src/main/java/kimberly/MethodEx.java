package kimberly;

public class MethodEx {




    // static method
    static String name(String firstName){
        return firstName;
    }

    static void num(int num){

        System.out.println(num);

    }


    // Void method
    void  fullName(String firstName, String lastName){

       System.out.println(firstName + " " + lastName);


    }



    // Return method
    private int cal(){
        return 0;
    }



    public String isEvenOrOdd(int num){
        // body to be executed

        // 2, 4, 6, 8, 10, 12
        // modulo symbol

        if(num % 2 == 0){
            return "EVEN";
        }else {
            return "ODD";
        }
    }


    public int calculateTwoNumbers(int a, int b){

        return a + b;
    }

    /**
     *
     * @param args
     * create a method that takes in the firstname and lastname of the user as parameters and then return the user fullname,
     * then call the method inside your psvm, pass in the parameters so you display the user fullname to the console
     * firstname = Jon
     * lastname = Doe
     * fullname = Jon Doe
     */





    public static void main(String[] args) {


        MethodEx result = new MethodEx(); // here we are creating an object of the class so we can call the method

         // this is where we call the method

      //  System.out.println(result.isEvenOrOdd(3));




        System.out.println(result.calculateTwoNumbers(10, 20));



    }






}
