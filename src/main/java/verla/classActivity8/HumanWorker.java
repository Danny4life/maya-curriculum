package verla.classActivity8;

public class HumanWorker implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Human worker is eating...");
    }

    @Override
    public void work() {
        System.out.println("Human worker is working....");
    }
}
