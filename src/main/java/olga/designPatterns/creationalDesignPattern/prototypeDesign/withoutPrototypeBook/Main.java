package olga.designPatterns.creationalDesignPattern.prototypeDesign.withoutPrototypeBook;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // Manually creating each book (time-consuming if many books are similar)
        Book book1 = new Book("Design Patterns", "Erich Gamma", "Content of Design Patterns");
        book1.display();

        Book book2 = new Book("Design Patterns", "Erich Gamma", "Content of Design Patterns");
        book2.display();

        Book book3 = new Book("Design Patterns", "Erich Gamma", "Content of Design Patterns");
        book3.display();

        long end = System.currentTimeMillis();
        System.out.println("⏳ Total Time Taken: " + (end - start) / 1000.0 + " seconds");
    }

    /**
     * What Happens When You Run It?
     * Each book creation takes ~2 seconds.
     *
     * You’re manually repeating the same info (same title, author, content).
     *
     * Total time for 3 books = ~6 seconds.
     *
     * Even if the book info is the same, we pay the full price every time.
     *
     * The Problem
     * Tedious and slow to create many identical or similar books.
     *
     * Repetition of the same configuration is inefficient.
     *
     * Real systems (like a PDF reader or online bookstore) can't afford this.
     */
}
