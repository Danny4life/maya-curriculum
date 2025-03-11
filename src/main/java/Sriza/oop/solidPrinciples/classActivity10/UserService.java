package Sriza.oop.solidPrinciples.classActivity10;

public class UserService {

    private Database database; // no direct instantiation

    public UserService(Database database) {// ✅ Inject dependency via constructor
        this.database = database;
    }

    public void getUser() {
        database.connect();
        System.out.println("Fetching user data...");
    }
}
