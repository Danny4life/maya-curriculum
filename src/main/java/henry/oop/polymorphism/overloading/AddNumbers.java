package henry.oop.polymorphism.overloading;

public class AddNumbers {

    int addNumbers(int a, int b){
        return a + b;
    }

    int addNumbers(int a, int b, int c){
        return a + b + c;
    }

    int addNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }

    int addNumbers(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }


    public static void main(String[] args) {
        AddNumbers num = new AddNumbers();

        System.out.println(num.addNumbers(5,5));
        System.out.println(num.addNumbers(5,10,14));
        System.out.println(num.addNumbers(10, 20, 30, 40));
//        System.out.println(num.addNumbers(100, 200, 300, 400, 500));
    }




}
