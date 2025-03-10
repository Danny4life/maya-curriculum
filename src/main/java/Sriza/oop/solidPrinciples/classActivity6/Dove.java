package Sriza.oop.solidPrinciples.classActivity6;

public class Dove extends Bird implements Flyable{
    Dove(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high!");
    }
}
