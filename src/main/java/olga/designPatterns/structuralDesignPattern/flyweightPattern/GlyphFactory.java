package olga.designPatterns.structuralDesignPattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

//Flyweight Factory
public class GlyphFactory {
    private final Map<Character, Glyph> glyphMap = new HashMap<>();

    public Glyph getGlyph(char symbol) {
        if (!glyphMap.containsKey(symbol)) {
            glyphMap.put(symbol, new CharacterGlyph(symbol));
        }
        return glyphMap.get(symbol);
    }
}
