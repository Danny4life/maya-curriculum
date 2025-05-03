package olga.designPatterns.structuralDesignPattern.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza(); // Start with base pizza
        pizza = new CheeseDecorator(pizza); // Add cheese
        pizza = new TomatoDecorator(pizza); // Add tomato

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.getCost());
    }
}
