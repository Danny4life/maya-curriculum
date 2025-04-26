package olga.designPatterns.builderPattern.classActivity1;

public class Main {
    public static void main(String[] args) {
        // Create computer with only CPU and RAM
        Computer basicComputer = new Computer("Intel i5", "8GB");

        // Create computer with storage too
        Computer midComputer = new Computer("Intel i5", "8GB", "500GB HDD");

        // Create full-spec computer
        Computer gamingComputer = new Computer("Intel i7", "16GB", "1TB SSD", true);

      // Computer newCom = new Computer("16GB", "Intel i7", true, "1TB SSD"); // ❌ Totally wrong order!

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Mid Computer: " + midComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}


/**
 *
 * ❌ Problems With This Approach
 * 1. 🚫 Parameter Hell
 * You must pass parameters in the correct order.
 *
 * java
 * Copy
 * Edit
 * new Computer("16GB", "Intel i7", true, "1TB SSD"); // ❌ Totally wrong order!
 * 2. 😵 Hard to Read & Maintain
 *
 *
 *
 * new Computer("Intel i7", "16GB", "1TB SSD", true); // What does `true` mean again?
 * 3. 💣 Error-Prone for Large Objects
 * If you add 3 more optional fields later, you’ll need more constructors.
 */
