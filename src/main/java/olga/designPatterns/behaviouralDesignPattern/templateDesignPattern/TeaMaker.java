package olga.designPatterns.behaviouralDesignPattern.templateDesignPattern;

// 2
public class TeaMaker extends BeverageMaker{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }

}
