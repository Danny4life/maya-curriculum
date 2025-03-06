package Sriza.oop.classActivity1;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car toyota = new Car();
        toyota.color = "Red";
        toyota.speed = 120;

        Car bmw = new Car();
        bmw.color = "Blue";
        bmw.speed = 150;

        // Calling method
        toyota.showDetails();
        bmw.showDetails();
    }
}
