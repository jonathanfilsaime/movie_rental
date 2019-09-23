import java.math.BigDecimal;

public class ChildrenMovie extends Movie {

    private double price = 0;
    private int numberDays = 0;

    public ChildrenMovie(String title, boolean newRelease, int numberOfDays) {
        super(title, newRelease, numberOfDays);
        this.numberDays = numberOfDays;
    }

    @Override
    public BigDecimal getPrice() {
        if (this.isNewRelease()) {
            return new BigDecimal(this.numberDays * 3);
        }
        price += 1.5;
        if(this.numberDays > 3){
            price += (this.numberDays-3)* 1.5;
        }

        return new BigDecimal(price);
    }

    @Override
    public String toString() {
        return "ChildrenMovie{" +
                "price=" + price +
                '}';
    }
}
