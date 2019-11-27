package refactored;

import java.math.BigDecimal;

/**
 * This class models a Movie and implements the Interface Rental
 */
public class Movie implements Rental, Item {

    private int numberOfDays;
    private String title;
    private boolean newRelease;
    private Type type;

    public Movie() {}

    public Movie(String title, boolean newRelease) {
        this.title = title;
        this.newRelease = newRelease;
        this.type = Type.PURCHASEABLE;
    }

    public Movie(String title, boolean newRelease, int numberOfDays) {
        this.numberOfDays = numberOfDays;
        this.title = title;
        this.newRelease = newRelease;
        this.numberOfDays = numberOfDays;
        this.type = Type.RENTABLE;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    @Override
    public int getDaysRented() {
        return this.numberOfDays;
    }

    @Override
    public Movie getMovie() {
        return this;
    }

    @Override
    public BigDecimal getPrice() {
        if(Type.PURCHASEABLE.equals(type) && isNewRelease()){

            return Price.Builder.newInstance()
                    .setMoviePurchase()
                    .newReleasePurchase()
                    .build().computePrice();

        } else if (Type.PURCHASEABLE.equals(type) && !isNewRelease()) {

            return Price.Builder.newInstance()
                    .setMoviePurchase()
                    .build().computePrice();

        } else if (!Type.PURCHASEABLE.equals(type) && isNewRelease()) {

            return Price.Builder.newInstance()
                    .setMovieRental(numberOfDays)
                    .newReleaseRental(numberOfDays)
                    .build().computePrice();

        } else {

            return Price.Builder.newInstance()
                    .setMovieRental(numberOfDays)
                    .build().computePrice();
        }
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Item getItem() {
        return this;
    }
}