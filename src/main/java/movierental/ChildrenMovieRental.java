package movierental;

public class ChildrenMovieRental extends Rental {

    public static final double SUBSEQUENT_DAILY_PRICE = 1.5;
    private final double STANDARD_DAILY_PRICE = 1.5;
    private final int STANDARD_DAILY_PRICE_DURATION = 3;

    public ChildrenMovieRental(String movieTitle, int daysRented) {
        super(new Movie(movieTitle, Movie.CHILDRENS), daysRented);
    }

    @Override
    public double getPrice() {
        int daysWithMajoration = Math.max(getDaysRented(), STANDARD_DAILY_PRICE_DURATION) - STANDARD_DAILY_PRICE_DURATION;
        return STANDARD_DAILY_PRICE + daysWithMajoration * SUBSEQUENT_DAILY_PRICE;
    }

    @Override
    public int getBonus() {
        return 1;
    }
}
