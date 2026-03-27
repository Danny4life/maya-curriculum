package vinitha.method;

public class PrintMethod { // class is a blueprint for creating objects
    // an object is an instance of a class that has characteristics and behaviour


    int num = 20;

    public void fullName(String fistName, String lastName){


        String fullName = fistName + " " + lastName;

        System.out.println(fullName);
    }


    public static void main(String[] args) {

        PrintMethod obj = new PrintMethod();

        obj.fullName("John", "Doe");


        System.out.println();


    }




}
