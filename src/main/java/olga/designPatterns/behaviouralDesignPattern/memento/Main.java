package olga.designPatterns.behaviouralDesignPattern.memento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        System.out.println("🎉 Welcome to Console Text Editor!");
        System.out.println("Commands: type <text>, undo, show, exit");

        while (true) {
            System.out.print("\n> ");
            String input = scanner.nextLine().trim();

            if (input.startsWith("type ")) {
                String text = input.substring(5);
                history.save(editor.save()); // save before change
                editor.write(text);
            } else if (input.equalsIgnoreCase("undo")) {
                editor.restore(history.undo());
                System.out.println("↩️  Undo performed.");
            } else if (input.equalsIgnoreCase("show")) {
                editor.showContent();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting editor. Goodbye!");
                break;
            } else {
                System.out.println("❌ Unknown command.");
            }
        }

        scanner.close();

    }
}

/**
 * 🎉 Welcome to Console Text Editor!
 * Commands: type <text>, undo, show, exit
 *
 * > type Hello
 * > type  World!
 * > show
 * 📝 Editor Content: Hello World!
 *
 * > undo
 * ↩️  Undo performed.
 *
 * > show
 * 📝 Editor Content: Hello
 *
 * > undo
 * ↩️  Undo performed.
 *
 * > show
 * 📝 Editor Content:
 *
 * > exit
 * 👋 Exiting editor. Goodbye!
 */
