package refactored;

import refactored.output.model.xml.Statement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * this class is used to do the following computation:
 * 1- computes price
 * 2- computes reward points
 * 3- computes the statement
 * 4- outputs the statement in XML
 */
public class Transaction {

    private List<Item> items;
    private Customer customer;
    private BigDecimal price;

    public Transaction(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
        this.price = new BigDecimal(0);
    }


    public BigDecimal computePrice(){
        double amount = 0;

        for(int i = 0; i < items.size() ; i++ ){
            amount += items.get(i).getPrice().doubleValue();
        }

        price = new BigDecimal(amount + price.doubleValue()).setScale(1);
        return price;
    }


    public int computeRewardPoint(){

        int frequentRenterPoint = 0;

        for(int i = 0; i < items.size(); i++ ){
            if(items.get(i).getType().toString().equalsIgnoreCase(Type.RENTABLE.toString()) &&
                Movie.class.isAssignableFrom(items.get(i).getClass())) {
                int points = 0;
                Movie movie = (Movie) items.get(i);
                frequentRenterPoint += new RewardPointsStrategyFactory().create(customer, movie).computerRewardPoints(points);
            }
        }
        return frequentRenterPoint;

    }


    /**
     *
     * @return String
     */
    public String getStatement(){
        StringBuilder result = new StringBuilder();

        result.append("Rental Record for " + customer.getName() + "\n");

        items.forEach( r -> {

            result.append("\t" + r.getItem().getTitle() + "\t" + r.getItem().getPrice() + "\n");
        });

        result.append("Amount owed is " + price.toString() + "\n");
        result.append("You earned " + customer.getMovieRentalRewardPoints() + " frequent renter points  " + "\n");

        if (customer.getMovieRentalRewardPoints() >= 10) {
            int point = customer.getMovieRentalRewardPoints() / 10;
            result.append("Congratulations you've earned " + point + " free movie rentals");
        }

        return result.toString();
    }

    public List<Item> getRentals() {
        return items;
    }

    public void getStatementOutputInXML(){


        List<refactored.output.model.xml.Item> movieTitleAndPriceList = new ArrayList<>();

        items.forEach( r -> {

            refactored.output.model.xml.Item movieTitleAndPrice =
                    new refactored.output.model.xml.Item(r.getItem().getTitle(), r.getItem().getPrice().toString());
            movieTitleAndPriceList.add(movieTitleAndPrice);

        });

        Statement statement =
                new Statement(customer.getName(), movieTitleAndPriceList, price.toString(), Integer.toString(customer.getMovieRentalRewardPoints()));

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Statement.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(statement, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
