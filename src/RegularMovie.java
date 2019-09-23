import java.math.BigDecimal;

public class RegularMovie extends Movie {

    private double price = 0;
    private int numberOfDays = 0;

    public RegularMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public BigDecimal getPrice() {
        if (this.isNewRelease()) {
            return new BigDecimal(this.numberOfDays * 3);
        }

        price += 2;
        if(this.numberOfDays > 2){
            price += (this.numberOfDays -2) * 1.5;
        }

        return new BigDecimal(price);
    }


    @Override
    public String toString() {
        return "RegularMovie{" +
                "price=" + price +
                '}';
    }
}
