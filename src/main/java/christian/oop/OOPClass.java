package christian.oop;

import java.util.Optional;

public class OOPClass {

    private String name;  // null // John

   private String color;  // White

    private int age;  // 0  // 100

    String nameOne;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getNameOne() {
        return nameOne;
    }

    // All Argument Constructor
    public OOPClass(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    // No Argument constructor
    public OOPClass() {
    }

    // Getter is for getting a value
    // Setter is for updating a value


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    @Override
    public String toString() {
        return "OOPClass{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


    // An object is an instance of a class.
    // we use when we want to create properties from the class


    static void staticMethod(){

        System.out.println("I am a static method");

    }

    void nonStaticMethod(){
        System.out.println("I am a non static method");
    }

    public static void main(String[] args) {
        OOPClass object1 = new OOPClass("John", "White", 100);


        System.out.println("Before updating name with setter method");
        System.out.println(object1.getName());


        object1.setName("Joseph");

        System.out.println("After updating name with setter method");
        System.out.println(object1.getName());



    }
}
