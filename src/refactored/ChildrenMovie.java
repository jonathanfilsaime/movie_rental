package refactored;

import java.math.BigDecimal;

/**
 * this class is used to compute the price for a Children's Movie
 * this class extends the super class Movie
 * there are two case :
 * 1- Children Movie - new release
 * 2- Children Movie - not new release
 */
public class ChildrenMovie extends Movie implements Item {

    private String title;
    private Type type;
    private boolean newRelease;
    private int numberOfDays;

    public ChildrenMovie(String title, boolean newRelease) {
        super(title, newRelease);
        this.title = title;
        this.newRelease = newRelease;
        this.type = Type.PURCHASEABLE;
    }

    public ChildrenMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberOfDays = numberOfDays;
        this.title = title;
        this.newRelease = newRelease;
        this.numberOfDays = numberOfDays;
        this.type = Type.RENTABLE;
    }

    @Override
    public BigDecimal getPrice() {

        if (Type.PURCHASEABLE.equals(super.getType())) {

            if (isNewRelease()) {

                return Price
                        .Builder
                        .newInstance()
                        .setChildrenMoviePurchase()
                        .newReleasePurchase()
                        .build()
                        .computePrice()
                        .setScale(2, BigDecimal.ROUND_UP);

            } else {

                return Price
                        .Builder
                        .newInstance()
                        .setChildrenMoviePurchase()
                        .build()
                        .computePrice()
                        .setScale(2, BigDecimal.ROUND_UP);

            }
        }
        //rental
        else

        {
            if(isNewRelease()) {

                return Price.Builder.newInstance()
                        .setChildrenMovieRental(numberOfDays)
                        .newReleaseRental(numberOfDays)
                        .build()
                        .computePrice()
                        .setScale(2, BigDecimal.ROUND_UP);
            } else {

                return Price.Builder.newInstance()
                        .setChildrenMovieRental(numberOfDays)
                        .build()
                        .computePrice()
                        .setScale(2, BigDecimal.ROUND_UP);

            }
        }

    }

    @Override
    public String toString() {
        return "refactored.ChildrenMovie{" +
                "price=" + super.getPrice() +
                '}';
    }
}
