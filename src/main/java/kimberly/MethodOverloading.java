package kimberly;

public class MethodOverloading {


    void addNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }




    void addNumbers(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }


    void addNumbers(int num1, int num2, int num3, int num4){
        System.out.println(num1 + num2 + num3 + num4);
    }

    void addNumbers(int num1, int num2, int num3, int num4, int num5){
        System.out.println(num1 + num2 + num3 + num4 + num5);
    }

    void addNumbers(int num1, int num2, int num3, int num4, int num5, int num6){
        System.out.println(num1 + num2 + num3 + num4 + num5 + num6);
    }

    void addNumbers(double num1, double num2, double num3, double num4, double num5, double num6){
        System.out.println(num1 + num2 + num3 + num4 + num5 + num6);
    }

    public static void main(String[] args) {
        MethodOverloading res = new MethodOverloading();

        res.addNumbers(10, 20);
        res.addNumbers(20, 40, 50);
        res.addNumbers(20, 20, 20, 20);
        res.addNumbers(50, 50, 50, 50, 50);
        res.addNumbers(2,4,6,8,10,12);
        res.addNumbers(2.0,4.4,6.5,8.2,10.0,12.5);
    }
}
