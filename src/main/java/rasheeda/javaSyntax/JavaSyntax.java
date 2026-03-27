package rasheeda.javaSyntax;

public class JavaSyntax {

    // Syntax
    //Dynamically and statically type

//    String chainBox = "chain";
//    String ringBox = "rings";
//    String earingBox = "earings";



    // The difference between a Compile language and an Interpreted language
    // Compile means that Java is going to give you an error before you run the code


//    boolean foo = true;
//    boolean Foo = false;
//    String FOO = "no";

    // int, long, byte, short, boolean, float, double, char
//    int num = 10000000000;
//
//    long num1 = 10000000000;
//
//    byte num2 = 10000;
//
//    short num3 = 100000;
//
//    boolean b = true;
//    boolean be = false;
//
//    char c = 'A';
//
//    // String, Arrays, Classes, Objects
//
//    String s = "ABBBBBSGSGSGSGSGTETETEHSHSHSHSHSHHSHSHSHSHSHSHHSHSHHS";  // 00x890
//    int[] arr = {1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
//    String[] str = {"one", "two", "three", "four"};



    // This is a function

    String fullName(String firstName, String lastName){
        return firstName + " " + lastName;

    }

    static int addNumbers(int num1, int num2){
        return num1 + num2;
    }



    public static void main(String[] args) {

        JavaSyntax userFullName = new JavaSyntax();



        System.out.println(userFullName.fullName("john", "doe"));

        System.out.println(addNumbers(10, 20));
    }


    /**
     * To show your understanding of Java function , write a program using function that
     * takes in the user firstname and lastname and return the user fullname
     */

}
