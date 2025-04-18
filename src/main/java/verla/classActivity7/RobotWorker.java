package verla.classActivity7;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        System.out.println("Robot worker does not eat");
    }
}
