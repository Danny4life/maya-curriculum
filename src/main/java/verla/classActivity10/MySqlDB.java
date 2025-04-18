package verla.classActivity10;

public class MySqlDB implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to MYSQL Database...");
    }
}
