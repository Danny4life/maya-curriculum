package filip;

public class Main {

    public static void main(String[] args) {

        RegularClass obj = new RegularClass("John", 30);  // Instantiation

        System.out.println(obj.age);
        System.out.println(obj.name);



        obj.regularMethod();


        ChildClass obj1 = new ChildClass("Jane", 30);

        System.out.println(obj1.name);
        System.out.println(obj1.age);


        obj1.myMethod();


    }
}
