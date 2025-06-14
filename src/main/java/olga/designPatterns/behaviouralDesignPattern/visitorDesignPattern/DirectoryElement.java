package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;

import java.util.ArrayList;
import java.util.List;

// 3
public class DirectoryElement implements FileSystemElement{
    String name;
    List<FileSystemElement> children = new ArrayList<>();

    DirectoryElement(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element) {
        children.add(element);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }
}
