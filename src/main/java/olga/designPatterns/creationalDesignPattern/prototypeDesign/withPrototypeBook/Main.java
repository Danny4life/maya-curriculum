package olga.designPatterns.creationalDesignPattern.prototypeDesign.withPrototypeBook;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // Create only one "original" book
        Book original = new Book("Design Patterns", "Erich Gamma", "Content of Design Patterns");
        original.display();

        // Clone the original (very fast)
        Book clone1 = original.clone();
        clone1.display();

        Book clone2 = original.clone();
        clone2.display();

        Book clone3 = original.clone();
        clone3.display();

        long end = System.currentTimeMillis();
        System.out.println("⏳ Total Time Taken (with cloning): " + (end - start) / 1000.0 + " seconds");
    }
}

/**
 * What You’ll Notice
 * Only the first book takes 2 seconds to load.
 *
 * All clones are created instantly (no simulated delay).
 *
 * Total time = ~2 seconds instead of ~6 seconds (from earlier example).
 *
 * ✅ Better performance, less memory overhead, no redundant code.
 */
