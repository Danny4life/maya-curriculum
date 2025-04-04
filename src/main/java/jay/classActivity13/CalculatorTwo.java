package jay.classActivity13;

public class CalculatorTwo {
    public int add(int a, int b) {  // Method returns an int
        return a + b;  // Returning the sum
    }

    public static void main(String[] args) {
        CalculatorTwo calc = new CalculatorTwo();
        int result = calc.add(5, 10);  // Storing returned value
        System.out.println("Sum: " + result);

        // Using the returned value in another calculation
        int doubleResult = result * 2;
        System.out.println("Double the sum: " + doubleResult);
    }
}
