package olga.designPatterns.creationalDesignPattern.abstractFactoryDesign.classActivity1;

//Client Code
public class FurnitureStore {

    private Chair chair;
    private Sofa sofa;


    public FurnitureStore(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void describeFurniture() {
        chair.sitOn();
        sofa.lieOn();
    }


    public static void main(String[] args) {

        // User selects style at runtime
        FurnitureFactory factory = new ModernFurnitureFactory();
        FurnitureStore store = new FurnitureStore(factory);
        store.describeFurniture();

        System.out.println("Switching to Victorian style...");

        factory = new VictorianFurnitureFactory();
        store = new FurnitureStore(factory);
        store.describeFurniture();


//        Chair chair1 = new ModernChair();
//        Sofa sofa1 = new VictorianSofa();

    }
}

/**
 * Class Activity
 * 🔴 Without Abstract Factory
 * Have students create chair and sofa manually like this:
 * Chair chair = new ModernChair();
 * Sofa sofa = new VictorianSofa(); // Oops! mismatch
 */
