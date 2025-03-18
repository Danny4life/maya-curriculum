package jay.classActivity10;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1; // change i to 6 to show it still runs at-least one execution
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}
