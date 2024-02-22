package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public abstract class Rental {

    private final Movie _movie;
    private final int _daysRented;

    protected Rental(Movie movie, int daysRented) {
        if (daysRented < 1) {
            throw new IllegalArgumentException("Days rented must be greater than 0");
        }
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public abstract double getPrice();

    public abstract int getBonus();
}
