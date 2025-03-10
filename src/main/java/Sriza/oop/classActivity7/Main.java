package Sriza.oop.classActivity7;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine("V8", 500); // Creating Engine object
        Car car1 = new Car("Ford Mustang", engine1); // Aggregating Engine into Car

        car1.startCar(); // Testing the aggregation
    }
}
