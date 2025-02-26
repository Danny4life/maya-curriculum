package billy.classActivity2;

public class WithLambdaExpression {

    public static void main(String[] args) {

        SayName s1 = (name) -> "Hello, " + name;
        System.out.println(s1.sayName("John"));


    }
}
