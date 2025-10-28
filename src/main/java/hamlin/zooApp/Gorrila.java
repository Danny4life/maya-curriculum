package hamlin.zooApp;

public class Gorrila extends Animal{

    public Gorrila(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) {
        Gorrila gorrila = new Gorrila("Godzilla", "Black");


        System.out.println(gorrila);
    }
}
