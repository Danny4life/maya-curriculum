package olga.designPatterns.behaviouralDesignPattern.memento;

// 1 - The Memento (Snapshot)
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
