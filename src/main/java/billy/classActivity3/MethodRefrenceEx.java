package billy.classActivity3;

public class MethodRefrenceEx {

    public static void saySomething(){
        System.out.println("Hello this is a static method");
    }
    public static void main(String[] args) {

        SayAble sayAble = MethodRefrenceEx::saySomething;

        sayAble.say();

    }
}
