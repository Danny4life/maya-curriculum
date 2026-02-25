package vinitha.sms;

public class Principal extends Person{




    public Principal(String name, int age, String color) {
        super(name, age, color);
    }

    public static void main(String[] args) {

        Principal obj = new Principal("John", 30, "Black");

//        System.out.println(obj.name);
//        System.out.println(obj.age);
//        System.out.println(obj.color);


        obj.setName("Jane");
        obj.setName(String.valueOf(50));


        System.out.println(obj.getName());


    }

}
