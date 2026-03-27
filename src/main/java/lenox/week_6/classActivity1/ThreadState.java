package lenox.week_6.classActivity1;

public class ThreadState implements Runnable{

    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {
        // Create an object of the ThreadState class
        obj = new ThreadState();


        t1 = new Thread(obj);

        // The thread t1 is currently in the new state
        System.out.println("The state of the thread t1 after spawning it - " + t1.getState());


        // invoke the start method (RUNNABLE)
        t1.start();
        System.out.println("The state of the thread t1 after calling the start method it - " + t1.getState());


    }

    @Override
    public void run() {

        ThreadStateEx threadStateEx = new ThreadStateEx();
        Thread t2 = new Thread(threadStateEx);

        // t2 is in the NEW STATE

        // t2 is in the ACTIVE STATE
        t2.start();
        System.out.println("The state of the thread t2 after calling the start method it - " + t2.getState());


        try{
            // Move t1 to the timed waiting state
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state of the thread t2 after calling the sleep method on it - " + t2.getState());

        try{
            // Waiting for thread t2 to complete its execution
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state of the thread t2 after calling the join method on it - " + t2.getState());




    }





}
