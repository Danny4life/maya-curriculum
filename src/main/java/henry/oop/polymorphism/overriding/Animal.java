package henry.oop.polymorphism.overriding;

public class Animal {


    void eat(){
        System.out.println("animal is eating");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();
    }
}
