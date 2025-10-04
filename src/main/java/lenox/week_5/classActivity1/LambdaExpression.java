package lenox.week_5.classActivity1;

public class LambdaExpression {

    public static void main(String[] args) {

        SayName s1 = (name) -> "Hello, " + name;
        System.out.println(s1.sayName("JOHN"));
    }
}
