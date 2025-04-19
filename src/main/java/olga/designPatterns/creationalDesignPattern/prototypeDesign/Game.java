package olga.designPatterns.creationalDesignPattern.prototypeDesign;

// 3. Using the Prototype
public class Game {

    public static void main(String[] args) {
        Soldier original = new Soldier("Sword", 100);

        Soldier clone1 = (Soldier) original.clone();
        Soldier clone2 = (Soldier) original.clone();

        original.display();
        clone1.display();  // Soldier with Sword and health 100
        clone2.display();  // Soldier with Sword and health 100
    }
}
