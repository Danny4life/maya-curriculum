package Sriza.oop.solidPrinciples.classActivity7;

public class HumanWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Human workers are working");
    }

    @Override
    public void eat() {

        System.out.println("Human workers are eating");
    }
}
