package Sriza.oop.classActivity7;

public class Engine {
    String type;
    int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.println("Engine " + type + " with " + horsepower + " HP is starting...");
    }
}
