package Sriza.oop.solidPrinciples.classActivity7;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Robot workers are working");
    }

    // try to take it off to show how is being forced to use it
    @Override
    public void eat() {
        System.out.println("Robot workers does not eat because they are robot");
    }
}

/**
 * What’s the Problem?
 * RobotWorker does not eat, but it is forced to implement eat().
 * This breaks ISP because RobotWorker is depending on methods it does not use.
 * What if we add more unrelated methods? Every class will have unnecessary code.
 */
