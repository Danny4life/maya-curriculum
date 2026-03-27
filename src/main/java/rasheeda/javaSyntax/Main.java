package rasheeda.javaSyntax;

public class Main {

    public static void main(String[] args) {


        MyClass object1 = new MyClass();  // this is an object

        MyClass object2 = new MyClass();


        MyClass object3 = new MyClass();


        String name1 = object1.name = "John";
        String name2 = object2.name = "Jane";
        String name3 = object3.name = "Josh";

        object1.gender = "MALE";
        object2.gender = "FEMALE";
        object3.gender = "TRANSGENDER";

        object1.age = 15;
        object2.age = 17;
        object3.age = 22;


        object1.myMethod();
        object2.myMethod();
        object3.myMethod();

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
