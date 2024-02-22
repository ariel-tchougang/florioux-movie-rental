package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrenMovieRentalTest {
    @Test
    public void bonusIsOne() {
        Rental rental = new ChildrenMovieRental("movie", 1);
        assertEquals(1, rental.getBonus());
    }

    @Test
    public void priceWhenDayRentedLessOrEqualsToBasicPriceDurationIsOneAndHalf() {
        Rental rental = new ChildrenMovieRental("movie", 2);
        assertEquals(1.5, rental.getPrice(), 0.0);
    }

    @Test
    public void priceWhenDayRentedGreaterThanBasicPriceDuration() {
        Rental rental = new ChildrenMovieRental("movie", 4);
        assertEquals(3, rental.getPrice(), 0.0);
    }
}
