package jay.classActivity13;

public class Calculator {
    public void addAndPrint(int a, int b) {  // void method
        int sum = a + b;
        System.out.println("Sum: " + sum); // Prints the result
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addAndPrint(5, 10);  // Calls the void method

        // do this to show you can not reuse void
        //int myNum = calc.addAndPrint(10, 10);
    }
}
