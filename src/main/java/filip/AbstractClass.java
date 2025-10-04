package filip;

public abstract class AbstractClass {

    String name;

    int age;

    public AbstractClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void regularMethod(){
        System.out.println("i am a regular method");
    }

    abstract void myMethod();
}
