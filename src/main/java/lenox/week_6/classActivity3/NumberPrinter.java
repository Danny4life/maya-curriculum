package lenox.week_6.classActivity3;

public class NumberPrinter implements Runnable{


    private int start = 1;

    private int end = 10;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
