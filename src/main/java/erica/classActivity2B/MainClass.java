package erica.classActivity2B;

public class MainClass {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public int addNumbers(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(addTwoNumbers(10, 10)); //Returns the result to the caller


        MainClass obj = new MainClass();

        obj.addNumbers(2,2);
    }
}
