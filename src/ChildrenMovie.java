import java.math.BigDecimal;

public class ChildrenMovie extends Movie {

    private double price;
    private int numberDays;

    public ChildrenMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberDays = numberOfDays;
    }

    @Override
    public BigDecimal getPrice() {

        price = 0;

        if (this.isNewRelease()) {
            return new BigDecimal(this.numberDays * 3);
        }
        price += 1.5;
        if(this.numberDays > 3){
            price += (this.numberDays-3)* 1.5;
        }

        return new BigDecimal(price).setScale(1);
    }

    @Override
    public String toString() {
        return "ChildrenMovie{" +
                "price=" + price +
                '}';
    }
}
