package refactored.output.model.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * this class is only use to marshall the output
 * from a java object to an XML representation
 */
@XmlRootElement
public class Statement {

    private String customerName;
    private List<Item> MovieTitleAndPrice;
    private String amountOwed;
    private String frequentRentPoints;

    public Statement() {
    }

    public Statement(String customerName, List<Item> movieTitleAndPrice, String amountOwe, String frequentRentPoints) {
        this.customerName = customerName;
        MovieTitleAndPrice = movieTitleAndPrice;
        this.amountOwed = amountOwe;
        this.frequentRentPoints = frequentRentPoints;
    }

    public String getCustomerName() {
        return customerName;
    }

    @XmlElement
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getMovieTitleAndPrice() {
        return MovieTitleAndPrice;
    }

    @XmlElement
    public void setMovieTitleAndPrice(List<Item> movieTitleAndPrice) {
        MovieTitleAndPrice = movieTitleAndPrice;
    }

    public String getAmountOwed() {
        return amountOwed;
    }

    @XmlElement
    public void setAmountOwed(String amountOwed) {
        this.amountOwed = amountOwed;
    }

    public String getFrequentRentPoints() {
        return frequentRentPoints;
    }

    @XmlElement
    public void setFrequentRentPoints(String frequentRentPoints) {
        this.frequentRentPoints = frequentRentPoints;
    }
}
