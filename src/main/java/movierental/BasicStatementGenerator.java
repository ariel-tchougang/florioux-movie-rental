package movierental;

import java.util.List;

public class BasicStatementGenerator implements StatementGenerator {
    @Override
    public String generate(String customerName, List<Rental> customerRentals) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + customerName + "\n");

        for (Rental each : customerRentals) {
            double thisAmount = each.getPrice();

            // add frequent renter points
            frequentRenterPoints += each.getBonus();

            // show figures for this rental
            result.append("\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n");
            totalAmount += thisAmount;
        }

        // add footer lines
        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points");

        return result.toString();
    }
}
