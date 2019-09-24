package refactored;

import java.math.BigDecimal;

/**
 * This interface is a contract which
 * dictates what a rental should provide
 */
public interface Rental {

    public int getDaysRented();
    
    public Movie getMovie();

    public BigDecimal getPrice();

}