package lenox.week_2.polymorphism;

public class MethodOverloadingEx {

    // Create 5 methods that add different numbers
    //first method should add on two numbers, and so on and so forth


    void addNumbers(int a, int b){
        System.out.println(a + b);
    }

    void addNumbers(int a, int b, int c){
        System.out.println(a + b + c);
    }



    void addNumbers(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

    void addNumbers(int a, int b, int c, int d, int e){
        System.out.println(a + b + c + d + e);
    }
}
