package filip;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void myMethod() {
        System.out.println("huraay");
    }

    @Override
    public void methodWithBody() {
        System.out.println("hurrayy");
    }

    @Override
    public void anotherMethod(String name, String surname) {

    }

    @Override
    public void signup(String firstname, String lastname) {
        // logic that allows employee to signup

        System.out.println(firstname + " " + lastname);
    }


    // <Integer, String>
    // <"1", 1>  <2, "Boy">


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "1");

    }




}
