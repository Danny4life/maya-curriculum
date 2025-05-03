package olga.designPatterns.structuralDesignPattern.decoratorPattern;

public class TomatoDecorator extends PizzaDecorator{
    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    public double getCost() {
        return pizza.getCost() + 0.75;
    }
}

