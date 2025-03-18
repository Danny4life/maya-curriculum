package Sriza.designPattern.classActivity2;

public class SingletonExample {
    public static void main(String[] args) {
        // Getting the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Testing if both objects are the same
        System.out.println(obj1 == obj2); // true (Both references point to the same object)

        // Calling a method from Singleton
        obj1.showMessage();
    }
}
