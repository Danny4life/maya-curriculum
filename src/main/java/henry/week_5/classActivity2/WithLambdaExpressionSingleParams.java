package henry.week_5.classActivity2;

public class WithLambdaExpressionSingleParams {

    public static void main(String[] args) {

        SayName s1 = (name) -> "Hello " + name;
        System.out.println(s1.sayName("John"));
    }
}
