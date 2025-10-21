package henry.week_6.classActivity_2;

public class Main {

    public static void main(String[] args) {



        Thread worker1 = new Thread(new NumberPrinter(1, 5), "WORKER-1");
        Thread worker2 = new Thread(new NumberPrinter(6, 10), "WORKER-2");


        worker1.start();
        worker2.start();
    }
}
