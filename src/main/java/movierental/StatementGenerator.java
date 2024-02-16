package movierental;

import java.util.List;

public interface StatementGenerator {
    String generate(String customerName, List<Rental> customerRentals);
}
