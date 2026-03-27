package filip;

public class ChildClass extends AbstractClass{


    public ChildClass(String name, int age) {
        super(name, age);
    }

    @Override
    void myMethod() {
        System.out.println("I am a method");
    }
}
