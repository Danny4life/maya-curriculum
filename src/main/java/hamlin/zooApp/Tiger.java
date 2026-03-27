package hamlin.zooApp;

public class Tiger extends Animal{


    public Tiger(String name, String color) {
        super(name, color);
    }

    @Override
    void run() {
        super.run();

        System.out.println("Tiger is running");
    }

    public static void main(String[] args) {


        Tiger tiger1 = new Tiger("Tiger1", "Green");


        System.out.println(tiger1);

        tiger1.run();


    }


}
