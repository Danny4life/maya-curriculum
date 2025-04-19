package olga.designPatterns.creationalDesignPattern.prototypeDesign.withPrototypeBook;

public class Book implements Cloneable{

    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        // Simulate expensive object creation
        try {
            System.out.println("Loading book: " + title + "...");
            Thread.sleep(2000); // simulate delay
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

    // Clone method using the built-in clone()
   @Override
    public Book clone(){
      try{
          return (Book) super.clone();// shallow copy is enough for immutable fields

      } catch (CloneNotSupportedException e) {
          throw new RuntimeException("Cloning not supported",e);
      }
   }
}
