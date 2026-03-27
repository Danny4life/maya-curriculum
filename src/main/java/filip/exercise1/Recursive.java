package filip.exercise1;


/**
 *
 * function factorial(number):
 *  if number == 0 OR number == 1:
 *      return 1 // base
 *
 *      else:
 *      return num * factorial(number - 1)
 */

public class Recursive {


    public static long recursive(int number){

        if(number == 0 || number == 1){
            return 1;
        }

        return number * recursive(number - 1);
    }


    public static void main(String[] args) {

        int result = 4;
        System.out.println("Factorial of " + result + " is: " + recursive(result));
    }


}
