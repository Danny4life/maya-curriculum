package olga.designPatterns.creationalDesignPattern.singleton;

import Sriza.designPattern.classActivity2Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // do this first to show you can not create object of the singleton class
        //Singleton singleton = new Singleton();


        // Getting the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Testing if both objects are the same
        System.out.println(obj1 == obj2); // true (Both references point to the same object)

        // Calling a method from Singleton
        obj1.showMessage();

    }
}
