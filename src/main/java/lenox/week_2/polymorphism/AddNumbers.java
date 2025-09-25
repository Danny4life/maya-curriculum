package lenox.week_2.polymorphism;

public class AddNumbers implements AddTwoNumbers {

    @Override
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
