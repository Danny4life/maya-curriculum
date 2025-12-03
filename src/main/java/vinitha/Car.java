package vinitha;

public class Car {
    String name;

    String color;


    public void brake(){
        System.out.println("Car is braking");
    }


    // call the method
    public void drive(){
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car toyota = new Car();

        toyota.drive();


    }

}
