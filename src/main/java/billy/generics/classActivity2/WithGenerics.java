package billy.generics.classActivity2;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        // Creating a list that holds only Strings (Generics Used)
        ArrayList<String> list = new ArrayList<>();

        // Adding elements (Now it only allows Strings)
        list.add("Hello");
        list.add("World");

        // Retrieving elements (No explicit type casting needed)
        String text1 = list.get(0);
        String text2 = list.get(1);

        System.out.println("Text 1: " + text1);
        System.out.println("Text 2: " + text2);
    }
}
