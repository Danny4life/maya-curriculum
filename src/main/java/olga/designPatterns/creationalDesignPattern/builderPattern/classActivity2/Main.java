package olga.designPatterns.creationalDesignPattern.builderPattern.classActivity2;

public class Main {

    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard(true)
                .build();

        System.out.println(myComputer);


        Computer gamingCom = new Computer.Builder("HP", "300GB")
                .storage("100TB")
                .graphicsCard(true)
                .build();

        System.out.println(gamingCom);


        Computer housePc = new Computer.Builder("MAC", "40GB")
                .graphicsCard(true)
                .storage("20TB")
                .build();

        System.out.println(housePc);
    }
}

/**
 *  Line-by-Line Breakdown of the Builder Pattern
 *  Step 1: Computer Class Fields
 *  private final String CPU;
 * private final String RAM;
 * private final String storage;
 * private final boolean hasGraphicsCard;
 *
 * These are the fields of the Computer object.
 *
 * CPU and RAM are required, while storage and hasGraphicsCard are optional.
 *
 * They are final because we want Computer objects to be immutable once built.
 *
 * Step 2: The Private Constructor
 * private Computer(Builder builder) {
 *     this.CPU = builder.CPU;
 *     this.RAM = builder.RAM;
 *     this.storage = builder.storage;
 *     this.hasGraphicsCard = builder.hasGraphicsCard;
 * }
 *
 * This constructor is private, so only the Builder can create an instance of Computer.
 *
 * It copies values from the Builder to the Computer.
 *
 *
 * Step 3: The Builder Inner Class
 * This is a nested static class that helps build a Computer.
 *
 * It stores the same fields and collects the values before constructing the actual object.
 */
