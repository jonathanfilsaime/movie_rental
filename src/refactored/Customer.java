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
    private int age;
    private int rewardPoints;
    private List<Transaction> transactionHistory;


    public Customer(String name, int age) {
        transactionHistory = new ArrayList<>();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public int getAge() {
        return age;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    /**
     * This method
     * 1-computes the price
     * 2-updates the customer's frequent renter point
     * 3-add the transaction to the transaction history
     * @param items
     * @return
     */
    public Transaction rent(List<Item> items){
        Transaction transaction = new Transaction(items, this);
        transactionHistory.add(transaction);
        transaction.computePrice();
        setRewardPoints(transaction.computeRewardPoint());
        return transaction;

    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
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