package olga.designPatterns.behaviouralDesignPattern.visitorDesignPattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create file system
        DirectoryElement root = new DirectoryElement("root");
        root.add(new FileElement("readme.txt", 10));
        root.add(new FileElement("logo.png", 200));

        DirectoryElement docs = new DirectoryElement("docs");
        docs.add(new FileElement("design.pdf", 150));
        docs.add(new FileElement("report.docx", 120));
        root.add(docs);

        // Menu loop
        while (true) {
            System.out.println("\n📂 File System Visitor");
            System.out.println("1. Print File Structure");
            System.out.println("2. Calculate Total Size");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PrintVisitor printVisitor = new PrintVisitor();
                    root.accept(printVisitor);
                    break;
                case 2:
                    SizeVisitor sizeVisitor = new SizeVisitor();
                    root.accept(sizeVisitor);
                    System.out.println("📦 Total size: " + sizeVisitor.getTotalSize() + "KB");
                    break;
                case 3:
                    System.out.println("👋 Exiting...");
                    return;
                default:
                    System.out.println("❌ Invalid choice");
            }
        }
    }
}
