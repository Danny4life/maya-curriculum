package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;

// 6 -- visitor 2 -- Calculate total size
public class SizeVisitor implements Visitor {
    private int totalSize = 0;

    public void visit(FileElement file) {
        totalSize += file.size;
    }

    public void visit(DirectoryElement directory) {
        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}
