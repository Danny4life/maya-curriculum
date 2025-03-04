package billy.oop.classActivity4D;

public class Car {

    String brand;

    int speed;

    public Car(){

    }

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void display(){
        System.out.println("Brand: " + brand + " " + "Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", 30000);
        Car car3 = new Car("Honda", 1000);


        car1.display();
        car2.display();
        car3.display();
    }
}
