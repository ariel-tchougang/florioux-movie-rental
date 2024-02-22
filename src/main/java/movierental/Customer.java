package movierental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return Collections.unmodifiableList(_rentals);
    }

    public String getName() {
        return _name;
    }

    public String statement(StatementGenerator statementGenerator) {
        return statementGenerator.process(this);
    }
}
