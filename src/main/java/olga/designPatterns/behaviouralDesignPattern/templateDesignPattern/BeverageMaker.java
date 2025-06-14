package olga.designPatterns.behaviouralDesignPattern.templateDesignPattern;

// 1
public abstract class BeverageMaker {

    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}

