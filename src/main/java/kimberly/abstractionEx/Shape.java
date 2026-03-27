package kimberly.abstractionEx;

abstract public class Shape {

    String name;

    int size;

    // Non-abstract method - method with body
    void display(){
        System.out.println("Displaying shape");
    }

    // this is an abstract method - method without body
    abstract void abstractMethod();
}
