package kimberly.aggregation;

public class Car {

    String model;

    Engine engine; // Aggregation relationship

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
