package olga.designPatterns.behaviouralDesignPattern.interpreterDesignPattern;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Context setup
        Context context = new Context(Map.of(
                "A", true,
                "B", false,
                "C", true
        ));

        // Expression: A OR (B AND C)
        Expression a = new TerminalExpression("A");
        Expression b = new TerminalExpression("B");
        Expression c = new TerminalExpression("C");

        Expression bAndC = new AndExpression(b, c);
        Expression expr = new OrExpression(a, bAndC);

        System.out.println("Result: " + expr.interpret(context)); // true
    }
}
