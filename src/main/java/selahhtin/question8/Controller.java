package selahhtin.question8;

public class Controller {

    public static void drawPattern(int numberOfRows, int numberOfCols, String text1, String text2) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                // Check condition for alternate rows
                if (i % 2 == 0) {
                    System.out.print(text1 + " ");
                } else {
                    System.out.print(text2 + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {

        drawPattern(5, 8, "X", "0");
    }
}
