package henry.week_4.classActivity6.main;

import henry.week_4.classActivity6.model.Book;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Book> bookMap = new HashMap<>();

        Book book1 = new Book(1, "Thing fall apart", "Chinua Achebe", 20);
        Book book2 = new Book(2, "Animal Farm", "Geroge Orwell", 30);
        Book book3 = new Book(3, "Romeo and Juliet", "William Shakespear", 22);
        Book book4 = new Book(4, "Gifted Hands", "Ben Carson", 30);
        Book book5 = new Book(5, "Hunger Games", "Suzanne Collins", 34);

        bookMap.put("one", book1);
        bookMap.put("two", book2);
        bookMap.put("three", book3);
        bookMap.put("four", book4);
        bookMap.put("five", book5);


        for(Map.Entry b : bookMap.entrySet()){
            System.out.println(b.getKey() + " " + b.getValue());

        }

    }
}
