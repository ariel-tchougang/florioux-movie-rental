package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private final Movie _movie;
    private final int _daysRented;

    public Rental(Movie movie, int daysRented) {
        if (daysRented < 1) {
            throw new IllegalArgumentException("Days rented must be greater than 0");
        }
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
        if (Movie.NEW_RELEASE == _movie.getPriceCode()) {
            return _daysRented * 3;
        }

        double basicPrice = Movie.REGULAR == _movie.getPriceCode() ? 2 : 1.5;
        int basicPriceDuration = Movie.REGULAR == _movie.getPriceCode() ? 2 : 3;
        int days = Math.max(_daysRented, basicPriceDuration);
        return basicPrice + (days - basicPriceDuration) * 1.5;
    }
}
