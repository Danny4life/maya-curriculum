package vinitha.abstraction;

public class ClassB extends ClassA {


    @Override
    void abstractMethod(String name) {
        System.out.println("hhhhhhh");
    }

    @Override
    String abstractMethod2(String name) {
        return "Hello";
    }


    @Override
    void nonAbstractMethod(){
        System.out.println("hhshshshshsssh");
    }
}
