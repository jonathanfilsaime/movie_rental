
import java.math.BigDecimal;
import java.util.List;

public class Transaction {
    private List<Rental> rentals;
    private Customer customer;

    public Transaction(List<Rental> rentals, Customer customer) {
        this.rentals = rentals;
        this.customer = customer;
    }


    public BigDecimal computePrice(){
        double amount = 0;

        for(int i = 0; i < rentals.size() ; i++ ){
            amount += rentals.get(i).getPrice().doubleValue();
        }

        return new BigDecimal(amount);
    }


    public int computeRewardPoint(){
        return 0;
    }


    public String getStatement(){
        this.computePrice();
        return this.toString();
    }

}
