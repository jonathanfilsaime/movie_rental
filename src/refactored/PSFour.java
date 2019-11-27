package refactored;

import java.math.BigDecimal;

public class PSFour implements Item {
    private Type type;
    private String title;
    private int daysRented;

    public PSFour(String title) {
        this.title = title;
        this.type = Type.PURCHASEABLE;
    }

    public PSFour(String title, int daysRented) {
        this.title = title;
        this.type = Type.RENTABLE;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(9.99).setScale(2, BigDecimal.ROUND_UP);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Item getItem() {
        return this;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
