package movierental;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void statementWithBasicStatementGenerator() {
        Customer customer = new Customer("Bob");
        customer.addRental(new RegularMovieRental("Jaws", 2));
        customer.addRental(new RegularMovieRental("Golden Eye", 3));
        customer.addRental(new NewReleaseRental("Short New", 1));
        customer.addRental(new NewReleaseRental("Long New", 2));
        customer.addRental(new ChildrenMovieRental("Bambi", 3));
        customer.addRental(new ChildrenMovieRental("Toy Story", 4));

        String expected = "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";

        assertEquals(expected, customer.statement(new BasicStatementGenerator()));
    }

    @Test
    public void statementWithHtmlStatementGenerator() {
        Customer customer = new Customer("martin");
        customer.addRental(new RegularMovieRental("Jaws", 2));
        customer.addRental(new RegularMovieRental("Golden Eye", 3));
        customer.addRental(new NewReleaseRental("Short New", 1));
        customer.addRental(new NewReleaseRental("Long New", 2));
        customer.addRental(new ChildrenMovieRental("Bambi", 3));
        customer.addRental(new ChildrenMovieRental("Toy Story", 4));

        String expected = "<h1>Rental Record for <em>martin</em></h1>\n"
                .concat("<table>\n")
                .concat("\t<tr><td>Jaws</td><td>2.0</td></tr>\n")
                .concat("\t<tr><td>Golden Eye</td><td>3.5</td></tr>\n")
                .concat("\t<tr><td>Short New</td><td>3.0</td></tr>\n")
                .concat("\t<tr><td>Long New</td><td>6.0</td></tr>\n")
                .concat("\t<tr><td>Bambi</td><td>1.5</td></tr>\n")
                .concat("\t<tr><td>Toy Story</td><td>3.0</td></tr>\n")
                .concat("</table>\n")
                .concat("<p>Amount owed is <em>19.0</em></p>\n")
                .concat("<p>You earned <em>7</em> frequent renter points</p>");

        assertEquals(expected, customer.statement(new HtmlStatementGenerator()));
    }
}
