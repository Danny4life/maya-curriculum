package Sriza.designPattern.classActivity2Singleton.lazyLoadedEx;

public class LazySingleton {
    // Step 1: Declare the instance, but do NOT initialize it
    private static LazySingleton instance;

    // Step 2: Private constructor
    private LazySingleton() {
        System.out.println("🔥 LazySingleton Instance Created!");
    }

    // Step 3: Create the instance only when first accessed
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("My message");
    }

    public static void main(String[] args) {
        System.out.println("🔄 Main method started...");
        // Instance is NOT created yet, only created when getInstance() is called
//        LazySingleton singleton = LazySingleton.getInstance();
//
//        singleton.showMessage();


        /**
         * How Do We Confirm It's Lazily Loaded?
         * "🔄 Main method started..." prints first, meaning the instance is not created at class loading.
         *
         * "🔥 LazySingleton Instance Created!" appears only after calling getInstance().
         *
         * This proves the instance is created only when needed.
         */
    }
}
