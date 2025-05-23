package olga.designPatterns.structuralDesignPattern.compositePattern;

// 2. Leaf class
public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
