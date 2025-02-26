package billy.classActivity3;

public class InstanceMethodReference {

    public void saySomething(){
        System.out.println("Hello, this is a non-static method");
    }

    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();

        SayAble sayAble = methodReference::saySomething;

        sayAble.say();
    }
}
