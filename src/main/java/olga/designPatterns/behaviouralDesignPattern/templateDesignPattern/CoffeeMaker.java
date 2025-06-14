package olga.designPatterns.behaviouralDesignPattern.templateDesignPattern;

public class CoffeeMaker extends BeverageMaker{
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}
