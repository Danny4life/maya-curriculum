package henry.oop.polymorphism.overriding;

public class Dog extends Animal{

    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog bingo = new Dog();

        bingo.eat();
    }
}
