package Sriza.oop.solidPrinciples.classActivity6;

public class Penguin extends Bird{
    Penguin(String name) {
        super(name);
    }

    void swim() {
        System.out.println(name + " is swimming in water!");
    }
}
