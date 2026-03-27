package henry.oop.classesAndObject;

public class Main {

    public static void main(String[] args) {

        Car honda = new Car();
        honda.color = "White";
        honda.speed = 200;

        System.out.println(honda);

        Car toyota = new Car();
        toyota.color = "Grey";
        toyota.speed = 150;

        System.out.println(toyota);


        Car benz = new Car();
        benz.color = "Black";
        benz.speed = 300;

        System.out.println(benz);
    }
}
