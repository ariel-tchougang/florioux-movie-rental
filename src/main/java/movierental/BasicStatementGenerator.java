package movierental;


public class BasicStatementGenerator implements StatementGenerator {
    @Override
    public String generate(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getPrice();

            // add frequent renter points
            frequentRenterPoints += rental.getBonus();

            // show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        // add footer lines
        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points");

        return result.toString();
    }
}
