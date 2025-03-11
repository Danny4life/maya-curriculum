package Sriza.oop.solidPrinciples.classActivity8;

public class HumanWorker implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Humans are eating");
    }

    @Override
    public void work() {

        System.out.println("Humans are working");

    }
}
