package lenox.week_2.classActivity1;

public class Car {


    String color;

    int speed;

    void brake(){
        System.out.println("I am matching brake");
    }


    // POJO - Plain Old Java Object

    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.color = "RED";
        toyota.speed = 120;
        toyota.brake();



        Car honda = new Car();
        honda.color = "WHITE";
        honda.speed = 200;
        honda.brake();


        Car bmw = new Car();
        bmw.color = "BLACK";
        bmw.speed = 290;
        bmw.brake();
    }



}
