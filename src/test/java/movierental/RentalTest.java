package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RentalTest {

    @Test
    public void priceForNewReleasesIs3xDayRented() {
        Movie movie = new Movie("movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 4);
        assertEquals(12, rental.getPrice(), 0.0);
    }

    @Test
    public void priceForRegularMoviesWhenDayRentedLessOrEqualsToBasicPriceDurationIsTwo() {
        Movie movie = new Movie("movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        assertEquals(2, rental.getPrice(), 0.0);
    }

    @Test
    public void priceForRegularMoviesWhenDayRentedGreaterThanBasicPriceDuration() {
        Movie movie = new Movie("movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        assertEquals(3.5, rental.getPrice(), 0.0);
    }

    @Test
    public void priceForChildrenMoviesWhenDayRentedLessOrEqualsToBasicPriceDurationIsOneAndHalf() {
        Movie movie = new Movie("movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 2);
        assertEquals(1.5, rental.getPrice(), 0.0);
    }

    @Test
    public void priceForChildrenMoviesWhenDayRentedGreaterThanBasicPriceDuration() {
        Movie movie = new Movie("movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);
        assertEquals(3, rental.getPrice(), 0.0);
    }
}
