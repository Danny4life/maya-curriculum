package vinitha;

public class LocalVariable {

    // for instance variable, we can re-assigned value anywhere within the class
    // because they belong to the class, meaning they have a high visibility
    // than the local variable
    int sum = 500; // this is an instance variable



    // the static variable belongs to all classes and we can re-assigned to any class that we want
    // meaning that the static variable has the highest variable visibility
    static int num = 400; // this is a static variable


    public void localMethod(){

        // the visibility of a local variable is seen and used only within the body of the method
        // or curly braces
        int localVariable = 100; // This is a local variable

        localVariable = 1000;


        sum = 700;
    }




    // Assignment - Create a new project, create class and declare a string variable
    // hello, then declare another string variable world, then add hello + world
    // to print out hello world. then push your to a new repository on github and send the link
    // so i can view your code








}
