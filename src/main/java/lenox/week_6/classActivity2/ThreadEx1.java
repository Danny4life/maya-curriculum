package lenox.week_6.classActivity2;

public class ThreadEx1 extends Thread{


//    @Override
//    public void run() {
//        System.out.println("running thread");
//    }

    public static void main(String[] args) {

        ThreadEx1 obj = new ThreadEx1();

        obj.start();
    }
}
