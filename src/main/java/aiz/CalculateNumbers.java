package aiz;

public class CalculateNumbers {


     void calculateTwoNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }


    public int sum(int num1, int num2){
        int result =  num1 + num2;

        return  result;
    }


    public boolean isTrue(int num){



         if(num == 10){
             return true;
         }

         return false;
    }

    public String myNum(int num){
         if(num == 20){
             return "CORRECT";
         }

         return "INCORRECT";
    }


    public static void main(String[] args) {

         CalculateNumbers obj = new CalculateNumbers();


       //  obj.calculateTwoNumbers(30, 50);

       // System.out.println(obj.isTrue(20));

        System.out.println(obj.myNum(200));
    }
}
