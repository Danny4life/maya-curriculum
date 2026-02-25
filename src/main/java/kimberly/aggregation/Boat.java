package kimberly.aggregation;

public class Boat {

    String model;

    Engine engine;

    public Boat(String model, Engine engine) {
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
