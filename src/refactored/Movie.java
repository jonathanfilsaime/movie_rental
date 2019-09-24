package refactored;

import java.math.BigDecimal;

public class Movie implements Rental {

    private int numberOfDays = 0;
    private String title;
    private boolean newRelease;

    public Movie(String title, boolean newRelease, int numberOfDays) {
        this.numberOfDays = numberOfDays;
        this.title = title;
        this.newRelease = newRelease;
        this.numberOfDays = numberOfDays;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean newRelease) {
        this.newRelease = newRelease;
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
        return new BigDecimal(this.numberOfDays * 3);
    }
}