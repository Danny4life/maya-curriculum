package bazhena.zooApplication;

public class Tiger extends Animal {
    public Tiger(String name, String color) {
        super(name, color);
    }

    // Good Code




    public static void main(String[] args) {

        Tiger tiger = new Tiger("Simba", "Brown");

        System.out.println(tiger.getName() + " " + tiger.getColor());

        tiger.run();

    }

}
