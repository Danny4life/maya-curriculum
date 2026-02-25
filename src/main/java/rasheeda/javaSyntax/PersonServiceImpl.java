package rasheeda.javaSyntax;

public class PersonServiceImpl implements PersonService{
    @Override
    public void run() {
        System.out.println("Person is running");
    }

    @Override
    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }



}
