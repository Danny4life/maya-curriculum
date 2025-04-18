package najahClasses.week1.controlFlowStatement.nestedLoop;

public class NestedForLoop {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){// outer for loop

            for(int j = 1; j <= 3; j++){ // inner for loop
                System.out.println(i + " " + j);
            }

        }
    }
}
