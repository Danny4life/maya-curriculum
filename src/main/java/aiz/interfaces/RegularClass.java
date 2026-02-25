package aiz.interfaces;

public class RegularClass implements MyInterface, AnotherInterface{
    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
