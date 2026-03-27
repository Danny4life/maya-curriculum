package vinitha.controFlowStatement;

public class NestedForLoop {

    public static void main(String[] args) {



        for(int i = 1; i <= 3; i++){ // Outer For Loop

            for(int j = 1; j <= 3; j++){ // Inner For Loop

                System.out.println(i + " " + j);
           }
        }
    }
}
