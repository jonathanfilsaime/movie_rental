
import java.math.BigDecimal;
import java.util.List;

public class Transaction {

    private List<Rental> rentals;
    private Customer customer;
    private BigDecimal price;

    public Transaction(List<Rental> rentals, Customer customer) {
        this.rentals = rentals;
        this.customer = customer;
    }


    public BigDecimal computePrice(){
        double amount = 0;

        for(int i = 0; i < rentals.size() ; i++ ){
            amount += rentals.get(i).getPrice().doubleValue();
        }

        price = new BigDecimal(amount);
        return price;
    }


    public int computeRewardPoint(){

        int frequentRenterPoint = 0;

        for(int i = 0; i < rentals.size(); i++ ){
            frequentRenterPoint++;

            if(rentals.get(i).getMovie().isNewRelease()){
                frequentRenterPoint++;
            }
        }
        return frequentRenterPoint;
    }


    public String getStatement(){
        System.err.println(customer.getName());

        rentals.forEach( r -> {
            System.err.println(r.getMovie().getTitle());
            System.err.println(r.getMovie().getPrice());
        });

        System.err.println(customer.getRewardPoints());

        return this.toString();
    }

}
