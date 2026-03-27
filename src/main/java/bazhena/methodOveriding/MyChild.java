package bazhena.methodOveriding;

public class MyChild extends MyParent{


    @Override
    void display(){
        System.out.println("I am just overriding the parent method");
    }

    @Override
    void calculate(int num1, int num2){
        System.out.println(num1 * num2); // it is multiplying two numbers

    }

    void cal(int num1, int num2){
        System.out.println(num1 * num2);
    }
}
