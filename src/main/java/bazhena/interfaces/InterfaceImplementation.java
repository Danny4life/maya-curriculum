package bazhena.interfaces;

import bazhena.zooApplication.Animal;

public class InterfaceImplementation extends Animal implements MyInterface, AnotherInterface{
    public InterfaceImplementation(String name, String color) {
        super(name, color);
    }

    @Override
    public void myMethod() {
        System.out.println("This method is now implemented");
    }

    @Override
    public void calculateTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    @Override
    public void anotherAbstractMethod() {
        System.out.println("This method is now also implemeted");
    }


//    @Override
//    public void myMethod() {
//        System.out.println("I have implement this method");
//    }
//
//    @Override
//    public void anotherAbstractMethod() {
//        System.out.println("Another method implemented");
//    }
}
