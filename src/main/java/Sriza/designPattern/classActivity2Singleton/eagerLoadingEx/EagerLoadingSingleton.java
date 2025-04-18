package Sriza.designPattern.classActivity2Singleton.eagerLoadingEx;

public class EagerLoadingSingleton {

    // Step 1: Create the instance immediately at class loading
    private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

    // Step 2: Private constructor to prevent instantiation
    private EagerLoadingSingleton() {
        System.out.println("🔥 EagerSingleton Instance Created!");
    }

    // Step 3: Public method to return the instance
    public static EagerLoadingSingleton getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("My message");
    }

    public static void main(String[] args) {

            System.out.println("🔄 Main method started...");
            // The instance should already be created even before calling getInstance()

        // call this next
//            EagerLoadingSingleton singleton = EagerLoadingSingleton.getInstance();
//
//            singleton.showMessage();


        /**
         *  How Do We Confirm It's Eagerly Loaded?
         * Instance is created before calling getInstance().
         *
         * You see "🔥 EagerSingleton Instance Created!" before "🔄 Main method started...".
         *
         * This proves the instance was created at class loading time.
         */



    }
}
