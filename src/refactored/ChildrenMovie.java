package refactored;

import java.math.BigDecimal;

/**
 * this class is used to compute the price for a Children's Movie
 * this class extends the super class Movie
 * there are two case :
 * 1- Children Movie - new release
 * 2- Children Movie - not new release
 */
public class ChildrenMovie extends Movie {

    private double price;
    private int numberOfDays;

    public ChildrenMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public BigDecimal getPrice() {

        price = 0;

        if (this.isNewRelease()) {
            return new BigDecimal(this.numberOfDays * 3).setScale(1);
        }

        price += 1.5;
        if(this.numberOfDays > 3){
            price += (this.numberOfDays -3)* 1.5;
        }

        return new BigDecimal(price).setScale(1);
    }

    @Override
    public String toString() {
        return "refactored.ChildrenMovie{" +
                "price=" + price +
                '}';
    }
}
