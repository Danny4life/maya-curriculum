package olga.designPatterns.behaviouralDesignPattern.interpreterDesignPattern;


// 3

public class TerminalExpression implements Expression{
    private final String variable;

    public TerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getValue(variable);
    }
}
