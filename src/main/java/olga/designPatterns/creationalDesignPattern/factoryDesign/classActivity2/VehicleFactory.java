package olga.designPatterns.creationalDesignPattern.factoryDesign.classActivity2;

// This is where the decisions happens
public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if (type.equalsIgnoreCase("car")) {
            return new Car(); //Here Factory decides to create a Car
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();//Here Factory decides to create a Bike
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck(); //Here Factory decides to create a Truck
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}


