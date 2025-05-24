package olga.designPatterns.behaviouralDesignPattern.interpreterDesignPattern;

import java.util.Map;

// 1.
public class Context {
    private final Map<String, Boolean> variables;

    public Context(Map<String, Boolean> variables) {
        this.variables = variables;
    }

    public boolean getValue(String variable) {
        return variables.getOrDefault(variable, false);
    }
}
