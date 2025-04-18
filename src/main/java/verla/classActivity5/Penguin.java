package verla.classActivity5;

public class Penguin extends Bird{

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can  not fly");
    }


    public static void main(String[] args) {

        Bird bird = new Penguin();

        bird.fly();
    }
}
