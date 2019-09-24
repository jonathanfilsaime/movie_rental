package output;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XmlRootElement
public class Statement {

    private String customerName;
    private List<Item> MovieTitleAndPrice;
    private String amountOwe;
    private String frequentRentPoints;

    public Statement() {
    }

    public Statement(String customerName, List<Item> movieTitleAndPrice, String amountOwe, String frequentRentPoints) {
        this.customerName = customerName;
        MovieTitleAndPrice = movieTitleAndPrice;
        this.amountOwe = amountOwe;
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

    public String getAmountOwe() {
        return amountOwe;
    }

    @XmlElement
    public void setAmountOwe(String amountOwe) {
        this.amountOwe = amountOwe;
    }

    public String getFrequentRentPoints() {
        return frequentRentPoints;
    }

    @XmlElement
    public void setFrequentRentPoints(String frequentRentPoints) {
        this.frequentRentPoints = frequentRentPoints;
    }
}
