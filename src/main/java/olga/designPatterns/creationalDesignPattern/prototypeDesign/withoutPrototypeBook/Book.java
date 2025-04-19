package olga.designPatterns.creationalDesignPattern.prototypeDesign.withoutPrototypeBook;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {

        // Simulate expensive object creation (like loading from database or file)
        try {
            System.out.println("Loading book: " + title + "...");
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void display() {
        System.out.println("📖 " + title + " by " + author);
        System.out.println("Content: " + content);
        System.out.println();
    }
}
