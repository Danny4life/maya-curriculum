package bazhena.zooApplication;

public class Lion extends Animal {


    public Lion(String name, String color) {
        super(name, color);
    }


    public static void main(String[] args) {

        Lion lion = new Lion("Dremo", "White");

        System.out.println(lion.getName() + " " + lion.getColor());

        lion.run();
    }
}
