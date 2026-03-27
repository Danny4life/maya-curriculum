package kimberly.aggregation;

public class Main {

    public static void main(String[] args) {




        Engine engine = new Engine("V6", 20);

        Car car1 = new Car("Toyota", engine);

        Boat boat = new Boat("Honda", engine);


        System.out.println("Car Model : " + car1.getModel());
        System.out.println("Car Engine Type : " + car1.getEngine().type);


        System.out.println("Boat Model : " + boat.getModel());
        System.out.println("Boat Engine Type : " + boat.getEngine().type);


        /**
         * Using the aggregation relationship - create a class and call it truck
         * the truck should reference the engine class and also have a model field
         * then go to the main class and create an object of the truck class
         * and print the truck model and the engine type.
         */


    }
}
