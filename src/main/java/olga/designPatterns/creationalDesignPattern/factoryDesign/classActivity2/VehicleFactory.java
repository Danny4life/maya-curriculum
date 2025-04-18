package olga.designPatterns.creationalDesignPattern.factoryDesign.classActivity2;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}


