package vinitha.interfaces;

public class MyRegularClass implements InterfaceClass {


    @Override
    public void myMethod() {
        System.out.println("hello hello");
    }

    @Override
    public String anotherMethod(String name) {
        return "hello hello";
    }

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public String fullName(String firstname, String lastname) {
        return firstname + " " + lastname;
    }
}
