package Sriza.oop.classActivity7;

public class Car {
    String model;
    Engine engine; // Aggregation - Car "has-a" Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println(model + " is starting...");
        engine.startEngine(); // Calling Engine's method
    }
}
