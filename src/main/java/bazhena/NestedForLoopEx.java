package bazhena;

public class NestedForLoopEx {

    public static void main(String[] args) {

        // Nested for loop

        for(int i = 1; i <= 3; i++){ // Outer for loop

            for(int j = 1; j <= 3; j++){ // Inner for loop
                System.out.println(i + " " + j);
            }
        }
    }
}
