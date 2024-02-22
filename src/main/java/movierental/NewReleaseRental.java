package movierental;

public class NewReleaseRental extends Rental {
    public NewReleaseRental(String movieTitle, int daysRented) {
        super(new Movie(movieTitle, Movie.NEW_RELEASE), daysRented);
    }

    @Override
    public double getPrice() {
        return getDaysRented() * 3;
    }

    @Override
    public int getBonus() {
        return getDaysRented() > 1 ? 2 : 1;
    }
}
