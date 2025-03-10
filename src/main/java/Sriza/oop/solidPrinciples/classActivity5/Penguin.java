package Sriza.oop.solidPrinciples.classActivity5;

public class Penguin extends Bird{
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }

    public static void main(String[] args) {

            Bird bird = new Penguin(); //  LSP Violation!
            bird.fly(); //  Throws an exception!

    }
}

/**
 * What’s the Problem?
 * We expected all birds to fly, but Penguin violates this expectation.
 * LSP is broken because Penguin does not behave like a Bird.
 * This forces us to write extra checks (e.g., if (bird instanceof Penguin) {...}),
 * making the code messy.
 */
