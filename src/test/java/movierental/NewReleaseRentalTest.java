package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseRentalTest {

    @Test
    public void bonusForNewReleasesIsOneWhenDaysRentedEqualsOne() {
        Rental rental = new NewReleaseRental("movie", 1);
        assertEquals(1, rental.getBonus());
    }

    @Test
    public void bonusForNewReleasesIsTwoWhenDaysRentedGreaterThanOne() {
        Rental rental = new NewReleaseRental("movie", 2);
        assertEquals(2, rental.getBonus());
    }

    @Test
    public void priceForNewReleasesIs3xDaysRented() {
        Rental rental = new NewReleaseRental("movie", 4);
        assertEquals(12, rental.getPrice(), 0.0);
    }
}
