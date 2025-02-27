package billy.generics.classActivity1;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        // Creating a list that holds Objects (No Generics)
        ArrayList list = new ArrayList();

        // Adding elements of different types
        list.add("Hello");
        list.add(123); // Integer
        list.add(45.6); // Double

        // Retrieving elements (Requires explicit type casting)
        String text = (String) list.get(0);
        System.out.println("Text " + text);

        // Type casting issue (This will cause a runtime error!)
        String number = (String) list.get(1);
        System.out.println("Number " + number);
    }
}
