package jay.classActivity12;

public class Greeting {
    public void sayHello() {
        System.out.println("Hello, welcome to Java class!");
    }

    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello();  // Method call
    }
}
