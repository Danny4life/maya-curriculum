package Sriza.classActivity1;

public class VariableScopes {
    static int staticVar = 100; // Static Variable

    int instanceVar = 50; // Instance Variable

    public void methodExample() {
        int localVar = 10; // Local Variable - show an example that local variable scope ends inside the method
        System.out.println("Local Variable: " + localVar);

        //instanceVar = 30;

        //staticVar = 35;
    }

   // localVar = 15;

    public static void main(String[] args) {
        VariableScopes obj = new VariableScopes();
        obj.methodExample();

        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
