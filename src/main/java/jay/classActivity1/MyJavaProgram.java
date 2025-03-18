package jay.classActivity1;

public class MyJavaProgram {
    public static void main(String[] args) {

        // to compile - javac MyFirstProgram.java (show the .class file after running this command)
        // to run - javap -c MyFirstProgram
        System.out.println("I am learning Java compilation process");
    }

    /**
     * Key Takeaway:
     *
     * getstatic retrieves System.out.
     *
     * ldc loads the string " I am learning Java compilation process".
     *
     * invokevirtual calls println.
     */
}
