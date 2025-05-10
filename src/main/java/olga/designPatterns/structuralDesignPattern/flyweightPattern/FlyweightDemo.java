package olga.designPatterns.structuralDesignPattern.flyweightPattern;

//Client
public class FlyweightDemo {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
       String document = "flyweight";

       // do this to show it uses the same memory internally
        //String document = "flyweightflyweight";


        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            Glyph glyph = factory.getGlyph(ch);
            glyph.render("position " + i);
        }
    }
}
