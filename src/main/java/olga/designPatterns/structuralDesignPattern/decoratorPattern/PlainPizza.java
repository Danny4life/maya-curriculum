package olga.designPatterns.structuralDesignPattern.decoratorPattern;

// 2 concrete component
public class PlainPizza implements Pizza{
    public String getDescription() {
        return "Plain Pizza";
    }

    public double getCost() {
        return 5.00;
    }
}
