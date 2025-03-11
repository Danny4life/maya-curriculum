package Sriza.oop.solidPrinciples.classActivity9;

public class UserService {

    // show for mysql only first
    private MysqlDatabase database = new MysqlDatabase(); // ❌ Creating dependency inside the class

    private PostgresSQL database2 = new PostgresSQL();

    public void getUser() {
        database.connect();
        database2.connect();
        System.out.println("Fetching user data...");
    }
}

/**
 * ⚠️ What's the Problem?
 * ❌ Tightly Coupled: UserService is hardcoded to use MySQLDatabase.
 * ❌ Difficult to Change: If we want to switch to PostgreSQLDatabase, we must modify UserService.
 * ❌ Hard to Test: We cannot replace MySQLDatabase with a mock version for unit testing.
 */
