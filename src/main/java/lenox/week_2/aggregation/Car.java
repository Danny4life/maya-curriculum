package lenox.week_2.aggregation;

public class Car {

    String color;

    public Car(String color) {
        this.color = color;
    }


//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                '}';
//    }

    public static void main(String[] args) {


        Car car = new Car("White");

        System.out.println(car);
    }


}
