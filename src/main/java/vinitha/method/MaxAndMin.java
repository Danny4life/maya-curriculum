package vinitha.method;

public class MaxAndMin {




    // User-define method



    public static int addThreeNumbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    public void addTwoNumbers(int num1, int num2){
        System.out.println(num1 + num2);


    }

    // debugging -- debugging means to find and fix errors



    /**
     * Things that qualifies a method
     * 1. Access modifier
     * 2. Return data type
     * 3. Method name
     * 4. parenthensis
     * 5. parameter - optional
     *
     *
     *
     */


    /**
     *
     * @param args
     * Write a method that takes three parameters as numbers
     * and multiply the three numbers and return the value
     */

    public static void main(String[] args) {


        MaxAndMin.addThreeNumbers(10, 20, 30);

    }
}
