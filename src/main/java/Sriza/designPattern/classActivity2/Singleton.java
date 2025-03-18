package Sriza.designPattern.classActivity2;

public class Singleton {
    // Step 1: Private static instance of the class
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Step 3: Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) { // Create instance only if not already created
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

/**
 *  Explanation
 * The constructor is private, preventing instantiation from outside the class.
 * The static method getInstance() ensures only one instance is created.
 * If an instance already exists, it returns the same instance instead of creating a new one.
 * Both obj1 and obj2 refer to the same instance, proving it’s a Singleton.
 */
