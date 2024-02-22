package movierental;

public class NewReleaseRental extends Rental {

    public static final int DAILY_PRICE = 3;

    public NewReleaseRental(String movieTitle, int daysRented) {
        super(new Movie(movieTitle), daysRented);
    }

    @Override
    public double getPrice() {
        return getDaysRented() * DAILY_PRICE;
    }

    @Override
    public int getBonus() {
        return getDaysRented() > 1 ? 2 : 1;
    }
}
