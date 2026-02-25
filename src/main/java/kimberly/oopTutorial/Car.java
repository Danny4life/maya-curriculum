package kimberly.oopTutorial;

public class Car {

    String color;  // characteristics

    int speed;  // characteristics

    // behavior
    void brake(){
        System.out.println("Car is braking");
    }


    // behaviour
    void drive(){
        System.out.println("Car is being drive");
    }


    public static void main(String[] args) {

        Car toyota = new Car();  // This is an object of the Car class - called toyota
        Car benz = new Car();
        Car ford = new Car();


        String toyotaColor = toyota.color = "RED";
        int toyotaSpeed = toyota.speed = 30;

        System.out.println("Toyota Color : " + toyotaColor);
        System.out.println("Toyota Speed : " + toyotaSpeed);


//        System.out.println(benz);
//        benz.color = "BLACK";
//        benz.speed = 120;


//        System.out.println(ford);
//        ford.color = "WHITE";
//        ford.speed = 100;
//
//
//        toyota.brake();
//        toyota.drive();
//
//        benz.brake();
//        benz.drive();
//
//        ford.brake();
//        ford.drive();
    }


    /**
     * To show your understanding of Class and Object
     * 1. Create a class and class in Animal
     * 2. Create two characteristics and call them name and color
     * 3. Create a method / behaviour that allows your animal to eat
     * 4. Create two animal objects of your animal class and call them dog and cat.
     */


}
