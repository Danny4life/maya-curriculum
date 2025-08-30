package henry.decisionMakingStatement.classActivity2;

public class IfElseIfLadder {

    public static void main(String[] args) {

        /**
         * Using if else if statement,
         * declare a string variable city and assigned New York to it.
         * using if else if statement, check if city == Washington, if true print
         * out city is Washington
         * check if city == Texas, if true print out city is Texas
         * else print out city
         */

        String city = "New York";

        if("New York" == "Washington"){
            System.out.println("City is Washington");
        } else if ("New York" == "Texas") {
            System.out.println("City is Texas");

        }else {
            System.out.println(city);
        }
    }
}
