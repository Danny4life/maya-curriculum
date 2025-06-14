package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;
// 2
public class FileElement implements FileSystemElement{
    String name;
    int size; // in KB

    FileElement(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
