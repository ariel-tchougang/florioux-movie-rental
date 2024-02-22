package movierental;

import org.junit.Test;


public class RentalTest {

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionWhenDaysRentedLessThanOne() {
        new Rental(new Movie("movie"), 0) {

            @Override
            public double getPrice() {
                return 0;
            }

            @Override
            public int getBonus() { return 0; }
        };
    }
}
