package refactored;

import java.math.BigDecimal;

/**
 * this class is used to compute the price for a Regular Movie
 * this class extends the super class Movie
 * there are two case :
 * 1- Regular Movie - new release
 * 2- Regular Movie - not new release
 */
public class RegularMovie extends Movie {

    private double price;
    private int numberOfDays;

    public RegularMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public BigDecimal getPrice() {

        price = 0;

        if (this.isNewRelease()) {
            return new BigDecimal(this.numberOfDays * 3).setScale(1);
        }

        price += 2;
        if(this.numberOfDays > 2){
            price += (this.numberOfDays -2) * 1.5;
        }

        return new BigDecimal(price).setScale(1);
    }


    @Override
    public String toString() {
        return "refactored.RegularMovie{" +
                "price=" + price +
                '}';
    }
}
