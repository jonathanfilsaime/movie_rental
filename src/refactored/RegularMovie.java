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


    private String title;
    private Type type;
    private boolean newRelease;
    private int numberOfDays;

    public RegularMovie(String title, boolean newRelease) {
        super(title, newRelease);
        this.title = title;
        this.newRelease = newRelease;
        this.type = Type.PURCHASEABLE;
    }

    public RegularMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberOfDays = numberOfDays;
        this.title = title;
        this.newRelease = newRelease;
        this.numberOfDays = numberOfDays;
        this.type = Type.RENTABLE;
    }

    @Override
    public BigDecimal getPrice() {
       return super.getPrice().setScale(2, BigDecimal.ROUND_UP);
    }


    @Override
    public String toString() {
        return "RegularMovie{ " +
                "price=" + super.getPrice() +
                "}";
    }
}
