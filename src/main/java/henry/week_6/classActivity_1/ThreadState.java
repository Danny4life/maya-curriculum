package henry.week_6.classActivity_1;

public class ThreadState implements Runnable{

    public static Thread t1;
    public static ThreadState obj;


    public static void main(String[] args) {

        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of thread t1 after creation - " + t1.getState());

        t1.start();
        System.out.println("The state of thread t1 after invoking the start method - " + t1.getState());
    }

    @Override
    public void run() {
        ThreadStateEx threadStateEx = new ThreadStateEx();
        Thread t2 = new Thread(threadStateEx);

        System.out.println("The state of thread t2 after creation - " + t2.getState());

        t2.start();
        System.out.println("The state of thread t2 after invoking the start method - " + t2.getState());


        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state of thread t2 after invoking the sleep method - " + t2.getState());

        try{
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state of thread t2 when the join method is invoked - " + t2.getState());

    }
}
