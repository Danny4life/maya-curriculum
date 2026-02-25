package aiz.abstraction;

public class Principal extends Person {

    boolean isAdmitStudent = true;


    public Principal(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    void walk() {

    }


    public static void main(String[] args) {
        Principal principal = new Principal("Mr John", 65, 5000);

        System.out.println(principal.getName() + " " + principal.getAge() + " " + principal.salary);
    }
}
