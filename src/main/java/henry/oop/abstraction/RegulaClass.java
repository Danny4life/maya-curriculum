package henry.oop.abstraction;

public class RegulaClass extends AbstractClass{
    @Override
    void abstractMethod() {
        System.out.println("say something");
    }


    public static void main(String[] args) {

        RegulaClass obj = new RegulaClass();


        obj.abstractMethod();
    }
}
