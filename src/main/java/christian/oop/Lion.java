package christian.oop;

public class Lion extends Animal {

    String strenght;

    public Lion(String name, String color, int age) {
        super(name, color, age);
    }


    public static void main(String[] args) {


        Lion l1 = new Lion("john", "white", 50);


        l1.strenght = "Powerful";
    }
}
