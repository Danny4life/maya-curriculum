package henry.week_6.classActivity_2;

public class NumberPrinter implements Runnable{

    private int start;

    private int stop;

    public NumberPrinter(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {

        for(int i = start; i <= stop; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
