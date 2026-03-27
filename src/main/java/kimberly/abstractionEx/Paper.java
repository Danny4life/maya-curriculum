package kimberly.abstractionEx;

public class Paper implements Print{


    @Override
    public void print() {
        System.out.println("Print paper");
    }

    @Override
    public void name(String name) {

        System.out.println("name of the paper is : " + name);
    }
}
