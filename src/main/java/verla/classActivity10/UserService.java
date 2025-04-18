package verla.classActivity10;

public class UserService {

    private Database database; // No direct instantiation

    public UserService(Database database) { // injecting dependencies via constructors
        this.database = database;
    }


    public void getUser(){
        database.connect();
        System.out.println("Fetching user data...");
    }
}
