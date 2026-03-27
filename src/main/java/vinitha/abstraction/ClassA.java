package vinitha.abstraction;

abstract public class ClassA {

    String a;
    String b;
    String c;
    String d;


    // An Abstract method is a method without body.

    abstract void abstractMethod(String name);

    abstract String abstractMethod2(String name);


    // Non-abstract method
    void nonAbstractMethod(){
        System.out.println("Hello");
    }


    //Abstract can not and must not contain psvm - because we can not create object from an abstract class
    // The purpose of an abstract is to store variables and abstract methods as well as non-abstract method
    // That other classes can inherit and then implement





}
