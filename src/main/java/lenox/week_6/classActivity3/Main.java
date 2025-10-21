package lenox.week_6.classActivity3;

public class Main {
    public static void main(String[] args) {

        // 1 printer -- 2 workers

        Thread worker1 = new Thread(new NumberPrinter(1, 5), "WORKER-1");
        Thread worker2 = new Thread(new NumberPrinter(6, 10), "WORKER-2");

        worker1.start();
        worker2.start();

        // 781.34.1.987.12



    }
}
