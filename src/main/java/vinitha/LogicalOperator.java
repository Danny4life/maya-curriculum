package vinitha;

public class LogicalOperator {

    public static void main(String[] args) {

//        int x = 10;
//
//        int y = 5;

        // && --- Logical AND -- And it means both operation must be true for it to be true
        // ! --- Logical NOT -- And it means only one operation must be true for it to be true
        // || --- Logical OR -- And it means only one operation must be true for it to be true


//        if(x < y && y < x){
//            System.out.println("Good, the code will run");
//        }

//        if(x < y || y < x){
//            System.out.println("Good, the code will run");
//        }


//        if(!(x < 5)){
//            System.out.println("YES");
//        }


        int age = 18;
        boolean hasID = false;

        if(age >= 18 || hasID){
            System.out.println("You are eligible to vote!!!");
        }
    }
}
