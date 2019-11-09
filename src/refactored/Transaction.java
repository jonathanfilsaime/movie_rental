package refactored;

import refactored.output.model.xml.Item;
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

    private List<Rental> rentals;
    private Customer customer;
    private BigDecimal price;

    public Transaction(List<Rental> rentals, Customer customer) {
        this.rentals = rentals;
        this.customer = customer;
        this.price = new BigDecimal(0);
    }


    public BigDecimal computePrice(){
        double amount = 0;

        for(int i = 0; i < rentals.size() ; i++ ){
            amount += rentals.get(i).getPrice().doubleValue();
        }

        price = new BigDecimal(amount + price.doubleValue()).setScale(1);
        return price;
    }


    public int computeRewardPoint(){

        int frequentRenterPoint = 0;

        for(int i = 0; i < rentals.size(); i++ ){
            int points = 0;
            frequentRenterPoint += new RewardPointsStrategyFactory().create(customer, rentals.get(i)).computerRewardPoints(points);
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

        rentals.forEach( r -> {
            result.append("\t" + r.getMovie().getTitle() + "\t" + r.getMovie().getPrice() + "\n");
        });

        result.append("Amount owed is " + price.toString() + "\n");
        result.append("You earned " + customer.getRewardPoints() + " frequent renter points  " + "\n");

        if (customer.getRewardPoints() >= 10) {
            int point = customer.getRewardPoints() / 10;
            result.append("Congratulations you've earned " + point + " free movie rentals");
        }

        return result.toString();
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void getStatementOutputInXML(){


        List<Item> movieTitleAndPriceList = new ArrayList<>();

        rentals.forEach( r -> {

            Item movieTitleAndPrice = new Item(r.getMovie().getTitle(), r.getMovie().getPrice().toString());
            movieTitleAndPriceList.add(movieTitleAndPrice);

        });

        Statement statement = new Statement(customer.getName(), movieTitleAndPriceList, price.toString(), Integer.toString(customer.getRewardPoints()));

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
