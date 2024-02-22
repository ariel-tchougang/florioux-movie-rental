package movierental;

public class ChildrenMovieRental extends Rental {

    public static final double ADDITIONAL_COST_PER_DAY = 1.5;
    public static final double PRICE = 1.5;
    public static final int PRICE_DURATION = 3;

    public ChildrenMovieRental(String movieTitle, int daysRented) {
        super(new Movie(movieTitle), daysRented);
    }

    @Override
    public double getPrice() {
        int extraDays = Math.max(getDaysRented(), PRICE_DURATION) - PRICE_DURATION;
        return PRICE + extraDays * ADDITIONAL_COST_PER_DAY;
    }

    @Override
    public int getBonus() {
        return 1;
    }
}
