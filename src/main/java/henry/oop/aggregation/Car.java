package henry.oop.aggregation;

public class Car {

    String color;

    String brand;


    Engine carEngine;  // This is aggregation -- weak relationship

    public Car(String color, String brand, Engine carEngine) {
        this.color = color;
        this.brand = brand;
        this.carEngine = carEngine;

    }


    public Car() {
    }

    public Car(String red, String toyota, String s) {
            this.color = red;
            this.brand = toyota;
            //this.carEngine = s;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", carEngine=" + carEngine +
                '}';
    }

    public static void main(String[] args) {


        Car car1 = new Car("Red", "Toyota", "40HP");


        System.out.println(car1);
    }


}
