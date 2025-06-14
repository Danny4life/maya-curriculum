package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;

// 1
public interface FileSystemElement {
    void accept(Visitor visitor);
}
