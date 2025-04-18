package verla.classActivity6;

public class Dove extends Bird implements FlyAble{
    public Dove(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high!");
    }
}
