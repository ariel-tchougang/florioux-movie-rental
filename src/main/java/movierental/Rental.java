package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getPrice() {

        if (Movie.NEW_RELEASE == getMovie().getPriceCode()) {
            return _daysRented * 3;
        }

        if (getDaysRented() <= 2) {
            return 2;
        }

        return 2 + (getDaysRented() - 2) * 1.5;
    }
}
