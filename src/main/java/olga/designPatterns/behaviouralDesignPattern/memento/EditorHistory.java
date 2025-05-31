package olga.designPatterns.behaviouralDesignPattern.memento;

import java.util.Stack;

// 3 - The Caretaker
public class EditorHistory {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return new EditorMemento(""); // empty state
    }
}
