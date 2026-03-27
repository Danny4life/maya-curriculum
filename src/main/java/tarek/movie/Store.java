package tarek.movie;

public class Store {

    private Movie[] movies;

    // Constructor
    public Store() {
        this.movies = new Movie[10];
    }

    // Getter (returns a copy)
    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);
    }

    // Setter (stores a copy)
    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    // Print the store contents
    public void printStore() {
        System.out.println("\n******************************MOVIE STORE*****************************");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }
}
