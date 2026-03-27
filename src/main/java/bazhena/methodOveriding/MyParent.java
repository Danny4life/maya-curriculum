package bazhena.methodOveriding;

public class MyParent {


    void display(){
        System.out.println("This is a display");
    }

    void calculate(int num1, int num2){
        System.out.println(num1 + num2);  // adding two numbers
    }

    void cal(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
