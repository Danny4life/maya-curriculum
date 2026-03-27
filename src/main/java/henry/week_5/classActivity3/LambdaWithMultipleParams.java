package henry.week_5.classActivity3;

public class LambdaWithMultipleParams {

    public static void main(String[] args) {

        AddNumbers add = (num1, num2) -> num1 + num2;
        System.out.println(add.addTwoNumbers(10, 20));
    }
}
