package lenox.week_5.classActivity2;

public class MethodReferenceEx {

    public static void saySomething(){
        System.out.println("Hello this is a static method");
    }


    public static void main(String[] args) {


        SayAble sayAble = MethodReferenceEx::saySomething;

        sayAble.say();
    }


}
