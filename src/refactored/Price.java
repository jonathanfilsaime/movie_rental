package refactored;

import java.math.BigDecimal;

public class Price {

    private final BigDecimal bookPurchase;
    private final BigDecimal bookRental;
    private final BigDecimal childrenMoviePurchase;
    private final BigDecimal childrenMovieRental;
    private final BigDecimal compactDiscPurchase;
    private final BigDecimal compactDiscRental;
    private final BigDecimal moviePurchase;
    private final BigDecimal movieRental;
    private final BigDecimal musicPurchase;
    private final BigDecimal musicRental;
    private final BigDecimal psFourPurchase;
    private final BigDecimal psFourRental;
    private final BigDecimal regularMoviePurchase;
    private final BigDecimal regularMovieRental;
    private final BigDecimal videoGamePurchase;
    private final BigDecimal videoGameRental;
    private final BigDecimal xBoxPurchase;
    private final BigDecimal xBoxRental;
    private final BigDecimal newReleaseRental;
    private final BigDecimal newReleasePurchase;

    public Price(Builder builder) {
        this.bookPurchase = builder.bookPurchase;
        this.bookRental = builder.bookRental;
        this.childrenMoviePurchase = builder.childrenMoviePurchase;
        this.childrenMovieRental = builder.childrenMovieRental;
        this.compactDiscPurchase = builder.compactDiscPurchase;
        this.compactDiscRental = builder.compactDiscRental;
        this.moviePurchase = builder.moviePurchase;
        this.movieRental = builder.movieRental;
        this.musicPurchase = builder.musicPurchase;
        this.musicRental = builder.musicRental;
        this.psFourPurchase = builder.psFourPurchase;
        this.psFourRental = builder.psFourRental;
        this.regularMoviePurchase = builder.regularMoviePurchase;
        this.regularMovieRental = builder.regularMovieRental;
        this.videoGamePurchase = builder.videoGamePurchase;
        this.videoGameRental = builder.videoGameRental;
        this.xBoxPurchase = builder.xBoxPurchase;
        this.xBoxRental = builder.xBoxRental;
        this.newReleasePurchase = builder.newReleasePurchase;
        this.newReleaseRental = builder.newReleaseRental;
    }


    public BigDecimal computePrice(){
        return new BigDecimal(
                    this.bookPurchase.doubleValue() +
                        this.bookRental.doubleValue() +
                        this.childrenMoviePurchase.doubleValue() +
                        this.childrenMovieRental.doubleValue() +
                        this.compactDiscPurchase.doubleValue() +
                        this.compactDiscRental.doubleValue() +
                        this.moviePurchase.doubleValue() +
                        this.movieRental.doubleValue() +
                        this.musicPurchase.doubleValue() +
                        this.musicRental.doubleValue() +
                        this.psFourPurchase.doubleValue() +
                        this.psFourRental.doubleValue() +
                        this.regularMoviePurchase.doubleValue() +
                        this.regularMovieRental.doubleValue() +
                        this.videoGamePurchase.doubleValue() +
                        this.videoGameRental.doubleValue() +
                        this.xBoxPurchase.doubleValue() +
                        this.xBoxRental.doubleValue() +
                        this.newReleasePurchase.doubleValue() +
                        this.newReleaseRental.doubleValue()
        );
    }

    public static class Builder{

        private BigDecimal bookPurchase = new BigDecimal(0.00);
        private BigDecimal bookRental = new BigDecimal(0.00);
        private BigDecimal childrenMoviePurchase = new BigDecimal(0.00);
        private BigDecimal childrenMovieRental = new BigDecimal(0.00);
        private BigDecimal compactDiscPurchase = new BigDecimal(0.00);
        private BigDecimal compactDiscRental = new BigDecimal(0.00);
        private BigDecimal moviePurchase = new BigDecimal(0.00);
        private BigDecimal movieRental = new BigDecimal(0.00);
        private BigDecimal musicPurchase = new BigDecimal(0.00);
        private BigDecimal musicRental = new BigDecimal(0.00);
        private BigDecimal psFourPurchase = new BigDecimal(0.00);
        private BigDecimal psFourRental = new BigDecimal(0.00);
        private BigDecimal regularMoviePurchase = new BigDecimal(0.00);
        private BigDecimal regularMovieRental = new BigDecimal(0.00);
        private BigDecimal videoGamePurchase = new BigDecimal(0.00);
        private BigDecimal videoGameRental = new BigDecimal(0.00);
        private BigDecimal xBoxPurchase = new BigDecimal(0.00);
        private BigDecimal xBoxRental = new BigDecimal(0.00);
        private BigDecimal newReleaseRental = new BigDecimal(0.00);
        private BigDecimal newReleasePurchase = new BigDecimal(0.00);


        public static Builder newInstance()
        {
            return new Builder();
        }

        public Builder setBookPurchase() {
            this.bookPurchase = new BigDecimal(19.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setBookRental(int daysRented) {
            this.bookRental = new BigDecimal(daysRented * 0.5).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setChildrenMoviePurchase() {
            this.childrenMoviePurchase = new BigDecimal(9.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setChildrenMovieRental(int daysRented) {

            double price = 1.5;
            if(daysRented > 3){
                price += (daysRented - 3)* 1.5;
            }
            
            this.childrenMovieRental = new BigDecimal(price);
            return this;
        }

        public Builder setCompactDiscPurchase() {
            this.compactDiscPurchase = new BigDecimal(14.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setCompactDiscRental(int daysRented) {
            this.compactDiscRental = new BigDecimal(0.99 * daysRented).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setMoviePurchase() {
            this.moviePurchase = new BigDecimal(19.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setMovieRental(int daysRented) {
            
            
            this.movieRental = new BigDecimal(daysRented * 3).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setMusicPurchase() {
            this.musicPurchase = new BigDecimal(0.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setMusicRental(int daysRented) {
            this.musicRental = new BigDecimal(0.05 * daysRented).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setPsFourPurchase() {
            this.psFourPurchase = new BigDecimal(299.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setPsFourRental(int daysRented) {
            this.psFourRental = new BigDecimal(0.99 * daysRented).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setRegularMoviePurchase() {
            this.regularMoviePurchase = new BigDecimal(9.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setRegularMovieRental(int daysRented) {
            
            double price = 2;
            if(daysRented > 2){
                price += (daysRented -2) * 1.5;
            }
            
            this.regularMovieRental = new BigDecimal(price).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setVideoGamePurchase() {
            this.videoGamePurchase = new BigDecimal(59.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setVideoGameRental(int daysRented) {
            this.videoGameRental = new BigDecimal(0.99 * daysRented).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setxBoxPurchase() {
            this.xBoxPurchase = new BigDecimal(399.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder setxBoxRental(int daysRented) {
            this.xBoxRental = new BigDecimal(0.99 * daysRented).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder newReleasePurchase() {
            this.newReleasePurchase = new BigDecimal(24.99).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Builder newReleaseRental(int daysRented) {
            
            this.newReleaseRental = new BigDecimal(daysRented * 3).setScale(3, BigDecimal.ROUND_UP);
            return this;
        }

        public Price build()
        {
            return new Price(this);
        }
    }
}
