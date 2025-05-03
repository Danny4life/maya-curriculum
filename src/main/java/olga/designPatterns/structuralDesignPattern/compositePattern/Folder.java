package olga.designPatterns.structuralDesignPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

// 3. Composite Class – Folder
public class Folder implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent child : children) {
            child.showDetails();
        }
    }
}
