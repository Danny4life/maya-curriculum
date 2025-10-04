package oop;

public class Addition {


    private String name; // Encapsulation

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


    public static void main(String[] args) {

        Addition addition = new Addition();

        addition.addNumbers(5,5);
        addition.addNumbers(10,5,5);
        addition.addNumbers(20,20,20,20);
        addition.addNumbers(25,25,25,25,25);
    }
}
