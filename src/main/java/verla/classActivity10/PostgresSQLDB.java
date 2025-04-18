package verla.classActivity10;

public class PostgresSQLDB implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to PostgresSQL Database...");
    }
}
