package tarek.movie;

import java.util.Scanner;

/**
 * How It Works
 *
 * The Movie class models a single movie with all necessary methods.
 *
 * The Store class holds up to 10 movies and protects internal data using copies.
 *
 * The main() method:
 *
 * Populates the store with movies.
 *
 * Continuously asks the user to select a movie and set a new rating.
 *
 * Updates and reprints the list until "stop" is entered.
 */

public class TopMovie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        // Populate store with movies
        store.setMovie(0, new Movie("The Shawshank Redemption", "BlueRay", 9.2));
        store.setMovie(1, new Movie("The Godfather", "BlueRay", 9.1));
        store.setMovie(2, new Movie("The Godfather: Part II", "DVD", 9.0));
        store.setMovie(3, new Movie("12 Angry Men", "DVD", 8.9));
        store.setMovie(4, new Movie("The Dark Knight", "BlueRay", 9.0));
        store.setMovie(5, new Movie("Schindler's List", "DVD", 8.9));
        store.setMovie(6, new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9));
        store.setMovie(7, new Movie("Pulp Fiction", "DVD", 8.8));
        store.setMovie(8, new Movie("The Good, the Bad and the Ugly", "DVD", 8.8));
        store.setMovie(9, new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8));

        String command = "continue";

        while (command.equals("continue")) {
            store.printStore();

            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            Movie movie = store.getMovie(choice);

            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double newRating = scanner.nextDouble();
            movie.setRating(newRating);

            store.setMovie(choice, movie);

            store.printStore();

            System.out.print("\nTo edit another rating, type: 'continue': ");
            command = scanner.next();
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
