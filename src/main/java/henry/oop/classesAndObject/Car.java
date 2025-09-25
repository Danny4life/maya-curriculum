package henry.oop.classesAndObject;

public class Car {

    String color;

    int speed;

    void brake(){
        System.out.println("Car is applying a brake");
    }

    void drive(){
        System.out.println("I am driving my car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }


    /**
     * 1  Create a class call Animal, it should have a field color,
     * 2. Create a Main class and instantiate 3 objects
     * lion, dog and tiger object from your class and print out the color value
     */
}
