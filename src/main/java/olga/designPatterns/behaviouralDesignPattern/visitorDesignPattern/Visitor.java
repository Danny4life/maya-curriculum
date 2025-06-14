package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;

// 4
public interface Visitor {
    void visit(FileElement file);
    void visit(DirectoryElement directory);
}
