package refactored;

import java.util.List;

public class Store {
    public Transaction checkout(Customer customer, List<Item> items) {
        return customer.checkout(items);
    }

    public String getStatement(Transaction transaction) {
        return transaction.getStatement();
    }
}
