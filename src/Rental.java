import java.math.BigDecimal;

public interface Rental {

    public int getDaysRented();
    
    public Movie getMovie();

    public BigDecimal getPrice();

}