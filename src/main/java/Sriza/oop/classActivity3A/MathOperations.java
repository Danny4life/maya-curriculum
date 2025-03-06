package Sriza.oop.classActivity3A;

public class MathOperations {
    // Method with 2 parameters
    public static int add(int a, int b){
        return a + b;

    }

    public static int add(int a, int b, int c){
        return a + b + c;

    }

    public static int add(int a, int b, int c, int d){
        return a + b +c + d;

    }

    public static int add(int a, int b, int c, int d, int e){
        return a + b + c + d + e;

    }


    public static void main(String[] args) {
        System.out.println(MathOperations.add(1,2));
        System.out.println(MathOperations.add(1,2, 3));
        System.out.println(MathOperations.add(1,2, 3, 4));
        System.out.println(MathOperations.add(1,2, 3, 4, 5));

    }
}
