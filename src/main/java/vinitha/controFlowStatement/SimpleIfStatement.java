package vinitha.controFlowStatement;

public class SimpleIfStatement {



    public static void main(String[] args) {

        int a = 40;

        int b = 40;


        if(a > b){
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is not greater than B");

        } else if (a == b) {
            System.out.println("A is equal to B");

        } else if(a >= b && a <= b) {
            System.out.println("A is not going to run");

        }else {
            System.out.println("Nothing just works");
        }

        }

    }

