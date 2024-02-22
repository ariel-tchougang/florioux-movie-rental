package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularMovieRentalTest {

    @Test
    public void bonusIsOne() {
        Rental rental = new RegularMovieRental("movie", 1);
        assertEquals(1, rental.getBonus());
    }

    @Test
    public void priceWhenDayRentedLessOrEqualsToBasicPriceDurationIsTwo() {
        Rental rental = new RegularMovieRental("movie", 2);
        assertEquals(2, rental.getPrice(), 0.0);
    }

    @Test
    public void priceWhenDayRentedGreaterThanBasicPriceDuration() {
        Rental rental = new RegularMovieRental("movie", 3);
        assertEquals(3.5, rental.getPrice(), 0.0);
    }
}
