package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RentalTest {

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionWhenDaysRentedLessThanOne() {
        new Rental(new Movie("movie", Movie.REGULAR), 0) {

            @Override
            public double getPrice() {
                return 0;
            }

            @Override
            public int getBonus() { return 0; }
        };
    }
}
