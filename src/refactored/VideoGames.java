package refactored;

import java.math.BigDecimal;

public class VideoGames implements Item {
    private Type type;
    private String title;
    private int daysRented;

    public VideoGames(String title) {
        this.title = title;
        this.type = Type.PURCHASEABLE;
    }

    public VideoGames(String title, int daysRented) {
        this.title = title;
        this.type = Type.RENTABLE;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    @Override
    public BigDecimal getPrice() {
        if(Type.PURCHASEABLE.equals(this.type) ){

            return Price.Builder
                    .newInstance()
                    .setVideoGamePurchase()
                    .build()
                    .computePrice()
                    .setScale(2, BigDecimal.ROUND_UP);

        }  else {

            return Price
                    .Builder
                    .newInstance()
                    .setVideoGameRental(daysRented)
                    .build()
                    .computePrice()
                    .setScale(2, BigDecimal.ROUND_UP);
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

    @Override
    public String getTitle() {
        return title;
    }
}
