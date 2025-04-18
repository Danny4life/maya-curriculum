package olga.designPatterns.creationalDesignPattern.abstractFactoryDesign.classActivity1;

//Concrete Factories
public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
