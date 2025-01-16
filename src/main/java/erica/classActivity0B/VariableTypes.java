package erica.classActivity0B;

public class VariableTypes {

    // Instance variable -- do this first and show how to access it outside the class
    // using variable type two class

    int num = 10;




    void myNum(){
        num = 20;
    }

    // do this second for local variable
    void localVariable(){
        int x = 20;

        x = 30;

        num = 15;

        myNum = 20;
    }

    // do this last for static variable

    static int myNum = 10;
}
