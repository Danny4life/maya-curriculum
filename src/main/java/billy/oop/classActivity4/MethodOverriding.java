package billy.oop.classActivity4;

public class MethodOverriding {


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

    public static double add(double a, double b, double c, double d, double e, double f){
        return a + b + c + d + e + f;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverriding.add(1,2));
        System.out.println(MethodOverriding.add(1,2, 3));
        System.out.println(MethodOverriding.add(1,2, 3, 4));
        System.out.println(MethodOverriding.add(1,2, 3, 4, 5));
        System.out.println(MethodOverriding.add(1,2, 3, 4, 5, 6));

    }
}
