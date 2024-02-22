package movierental;

public class HtmlStatementGenerator implements StatementGenerator
{
    public String process(Customer customer)
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("<h1>Rental Record for <em>" + customer.getName() + "</em></h1>\n");

        result.append("<table>\n");
        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getPrice();

            // add frequent renter points
            frequentRenterPoints += rental.getBonus();

            // show figures for this rental
            result.append("\t<tr><td>").append(rental.getMovie().getTitle())
                    .append("</td><td>").append(thisAmount).append("</td></tr>\n");
            totalAmount += thisAmount;
        }
        result.append("</table>\n");

        // add footer lines
        result.append("<p>Amount owed is <em>").append(totalAmount).append("</em></p>\n");
        result.append("<p>You earned <em>").append(frequentRenterPoints).append("</em> frequent renter points</p>");

        return result.toString();
    }
}
