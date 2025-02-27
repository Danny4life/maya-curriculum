package billy.generics.classActivity9;

public class Main {
    public static void main(String[] args) {
        // Repository for Users with Integer IDs
        GenericRepository<Integer, User> userRepo = new GenericRepository<>();

        // Adding users
        userRepo.save(1, new User("Alice", 25));
        userRepo.save(2, new User("Bob", 30));

        // Fetching and displaying user
        System.out.println("User with ID 1: " + userRepo.findById(1));

        // Printing all users
        System.out.println("\nAll Users:");
        userRepo.printAll();

        // Deleting a user
        userRepo.delete(1);
        System.out.println("\nAfter Deletion:");
        userRepo.printAll();
    }
}
