package lenox.week_6.classActivity2;

public class ThreadEx2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }


    public static void main(String[] args) {

        ThreadEx2 t1 = new ThreadEx2();
        Thread result = new Thread(t1);

        result.start();
    }
}
