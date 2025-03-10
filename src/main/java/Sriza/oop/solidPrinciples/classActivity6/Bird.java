package Sriza.oop.solidPrinciples.classActivity6;

public class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " is making a sound.");
    }
}
