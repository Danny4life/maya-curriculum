package verla.classActivity9;

public class UserService {

    private MysqlDatabase database = new MysqlDatabase();

   private PostgresSQL database2 = new PostgresSQL();


    public void getUser(){
        database.connect();
        database2.connect();

        System.out.println("Fetching user data...");
    }
}
