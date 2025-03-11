package Sriza.oop.solidPrinciples.classActivity8;

public class RobotWorker implements Workable{
    @Override
    public void work() {
        System.out.println("Robot workers are working");
    }
}

/**
 * Why is This Better?
 * ✅ RobotWorker is no longer forced to implement eat().
 * ✅ HumanWorker correctly implements both work and eat behaviors.
 * ✅ The system is scalable and flexible.
 */
