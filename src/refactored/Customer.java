package refactored;

import java.util.ArrayList;
import java.util.List;

/**
 * this class models the customer it holds
 * the customer's name
 * the customer's reward points
 * the customer's transaction history
 */
public class Customer {
    private String name;
    private int rewardPoints;
    private List<Transaction> transactionHistory;


    public Customer(String name) {
        transactionHistory = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    /**
     * This method
     * 1-computes the price
     * 2-updates the customer's frequent renter point
     * 3-add the transaction to the transaction history
     * @param rentals
     * @return
     */
    public Transaction rent(List<Rental> rentals){
        Transaction transaction = new Transaction(rentals, this);
        transaction.computePrice();
        setRewardPoints(transaction.computeRewardPoint());
        transactionHistory.add(transaction);
        return transaction;

    }

    @Override
    public String toString() {
        return "refactored.Customer{" +
                "name='" + name + '\'' +
                ", rewardPoints=" + rewardPoints +
                ", transactions=" + transactionHistory +
                '}';
    }
}