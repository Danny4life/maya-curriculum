package jay.classActivity14;

public class AreaCalculator {
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int area = calculateArea(5, 10);
        System.out.println("Area: " + area);
    }
}
