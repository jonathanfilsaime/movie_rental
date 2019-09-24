package refactored;

import java.util.ArrayList;
import java.util.List;

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