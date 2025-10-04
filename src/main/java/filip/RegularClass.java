package filip;

public class RegularClass {


    String name;

    int age;

    public RegularClass(String name, int age) {
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
        System.out.println("I am a regular method");
    }

}
