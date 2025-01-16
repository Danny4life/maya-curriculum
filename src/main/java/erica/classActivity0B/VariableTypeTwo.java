package erica.classActivity0B;

public class VariableTypeTwo {

    public static void main(String[] args) {

        // for instance variable we have to create an object of the class to
        // be able to access it.
        VariableTypes obj = new VariableTypes();
        System.out.println(obj.num);

        // as you can see i do not have to create an object to access the static variable coming
        // from another class
        VariableTypes.myNum = 30;
    }
}
