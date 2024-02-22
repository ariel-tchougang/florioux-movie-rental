package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    @Test
    public void rentalPriceForNewReleaseIs3xRentalDuration() {
        Movie movie = new Movie("New Release", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        assertEquals(9, rental.getPrice(), 0.0);
    }

    @Test
    public void rentalPriceForRegularIs2WhenRentalDurationIsLessOrEqualsToMaxDuration() {
        Movie movie = new Movie("New Release", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        assertEquals(2, rental.getPrice(), 0.0);
    }

    @Test
    public void rentalPriceForRegularWhenRentalDurationIsGreaterThanMaxDuration() {
        Movie movie = new Movie("New Release", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        assertEquals(3.5, rental.getPrice(), 0.0);
    }
}
