package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public abstract class Rental {

    private final Movie movie;
    private final int daysRented;

    protected Rental(Movie movie, int daysRented) {
        if (daysRented < 1) {
            throw new IllegalArgumentException("Days rented must be greater than 0");
        }
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public abstract double getPrice();

    public abstract int getBonus();
}
