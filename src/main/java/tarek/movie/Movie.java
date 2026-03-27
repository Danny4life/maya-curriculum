package tarek.movie;

public class Movie {

    private String name;
    private String format;
    private double rating;

    // Constructor
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // Copy Constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name;
    }
}

