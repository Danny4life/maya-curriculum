package bazhena;

public class Animal {


    String color; // field or variable or characteristic


    public String running(String name){
        return name + " is running";
    }



    // Constructor
//    public Animal(String color) {
//        this.color = color;
//    }

    public static void main(String[] args) {
        Animal dog = new Animal();

        Animal lion = new Animal();


        System.out.println(dog.running("Bingo"));

        System.out.println(lion.running("Mufasa"));
    }
}
