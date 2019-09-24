package refactored;

import refactored.output.model.xml.Item;
import refactored.output.model.xml.Statement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
            frequentRenterPoint++;

            if(rentals.get(i).getMovie().isNewRelease() && rentals.get(i).getDaysRented() > 1){
                frequentRenterPoint++;
            }
        }
        return frequentRenterPoint;
    }


    public String getStatement(){
        System.out.println("Rental Record for " + customer.getName());

        rentals.forEach( r -> {
            System.out.print("\t" + r.getMovie().getTitle() + "\t" + r.getMovie().getPrice() + "\n");
        });

        System.out.println("Amount owed is " + price.toString());
        System.out.println("You earned " + customer.getRewardPoints() + " frequent renter points  ");


        return this.toString();
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
