package hamlin.oop;

public class Car {

    String color;

    int speed;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }


    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }


    void drive(){
        System.out.println("Car is driving");
    }

    void brake(){
        System.out.println("Car is braking");
    }

    public static void main(String[] args) {

        Car toyota = new Car("White", 120);
        Car bmw = new Car("Blue", 150);
        Car ford = new Car("Black", 110);

//        System.out.println(toyota.color + " " + toyota.speed);
//        System.out.println(bmw.color + " " + bmw.speed);
//        System.out.println(ford.color + " " + ford.speed);


        toyota.drive();  // method calling by the object of a class

        toyota.brake();



    }
}
