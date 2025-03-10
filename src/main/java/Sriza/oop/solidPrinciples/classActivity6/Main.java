package Sriza.oop.solidPrinciples.classActivity6;

public class Main {
    public static void main(String[] args) {
        Bird dove = new Dove("dove");
        Bird penguin = new Penguin("Penguin");

        dove.makeSound();
        penguin.makeSound();

        // ✅ Only Flyable birds can fly
        Flyable flyingBird = new Dove("Dove");
        flyingBird.fly(); // ✅ Works perfectly!
    }
}
