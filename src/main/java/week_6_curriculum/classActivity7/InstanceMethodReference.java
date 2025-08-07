package week_6_curriculum.classActivity7;

public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is a non-static method");
    }

    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();

        // Referring non-static method using reference
        SayAble sayAble = methodReference::saySomething;

        // Calling interface method
        sayAble.say();

    }
}
