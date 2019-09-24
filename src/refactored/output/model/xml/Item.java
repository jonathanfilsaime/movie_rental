package refactored.output.model.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * this class is only use to marshall the output
 * from a java object to an XML representation
 */
@XmlRootElement
public class Item {

    private String movieTitle;
    private String moviePrice;

    public Item() {
    }

    public Item(String movieTitle, String moviePrice) {
        this.movieTitle = movieTitle;
        this.moviePrice = moviePrice;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    @XmlElement
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMoviePrice() {
        return moviePrice;
    }

    @XmlElement
    public void setMoviePrice(String moviePrice) {
        this.moviePrice = moviePrice;
    }
}
