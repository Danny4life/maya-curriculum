package Sriza.oop.solidPrinciples.classActivity10;

public class PostgresDb implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to PostgresSQL Database...");
    }
}
