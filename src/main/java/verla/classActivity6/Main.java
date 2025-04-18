package verla.classActivity6;

public class Main {

    public static void main(String[] args) {


        Bird dove = new Dove("dove");
        Bird penguin = new Penguin("penguin");

        dove.makeSound();
        penguin.makeSound();

        // Calling only fly able birds
        FlyAble flyingBird = new Dove("Dove");
        flyingBird.fly();
    }
}
