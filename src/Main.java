import refactored.*;

import java.util.ArrayList;
import java.util.List;

/**
 * this main class runs the refactored program
 * provides the output in both regular format of plain text
 * and in XML format
 */
public class Main {

    public static void main(String[] args) {

        //the following 3 movies are children movies which are not new releases
        Rental aladdin = new ChildrenMovie("Aladdin", false, 1);
        Rental up = new ChildrenMovie("Up", false, 3);
        Rental frozen = new ChildrenMovie("Frozen", false, 5);

        //creating new customer called Christopher
        Customer christopher = new Customer("Christopher");

        //Christopher list of rental
        List<Rental> christophersRentals = new ArrayList<>();

        //adding movies to Christopher's list of rental
        christophersRentals.add(aladdin);
        christophersRentals.add(up);
        christophersRentals.add(frozen);

        //Christopher rents 3 movies "aladdin, Frozen, Up"
        Transaction christophersTransaction = christopher.rent(christophersRentals);

        //Christopher's transaction statement
        christophersTransaction.getStatement();
        System.out.println("===XML===");
        christophersTransaction.getStatementOutputInXML();
        System.out.println("=========");

        System.out.println();

        //=================================================================================================//

        //the following 3 movies are regular movies which are not new releases
        Rental forrestGump = new RegularMovie("Forest Gump", false, 1);
        Rental sandlot = new RegularMovie("The sandlot", false, 2);
        Rental terminator = new RegularMovie("The Terminator", false, 5);

        //creating new customer called Fiona
        Customer fiona = new Customer("Fiona");

        //Fiona list of rental
        List<Rental> fionasRentals = new ArrayList<>();

        //adding movies to Fiona's list of rental
        fionasRentals.add(forrestGump);
        fionasRentals.add(sandlot);
        fionasRentals.add(terminator);

        //Fiona rents 3 movies "Forest Gump, The sandlot, The Terminator"
        Transaction fionasTransaction = fiona.rent(fionasRentals);

        //fiona's transaction statement
        fionasTransaction.getStatement();
        System.out.println("===XML===");
        fionasTransaction.getStatementOutputInXML();
        System.out.println("=========");

        System.out.println();

        //=================================================================================================//

        //the following 3 movies are children movies which are new releases
        Rental dumbo = new ChildrenMovie("Dumbo", true, 1);
        Rental toyStory = new ChildrenMovie("Toy Story", true, 3);
        Rental lionKing = new ChildrenMovie("The Lion King", true, 5);

        //creating new customer called Laura
        Customer laura = new Customer("Laura");

        //laura list of rental
        List<Rental> laurasRentals = new ArrayList<>();

        //adding movies to Laura's list of rental
        laurasRentals.add(dumbo);
        laurasRentals.add(toyStory);
        laurasRentals.add(lionKing);

        //Laura rents 3 movies "Dumbo, Toy Story, The Lion King"
        Transaction laurasTransaction = laura.rent(laurasRentals);

        //Laura's transaction statement
        laurasTransaction.getStatement();
        System.out.println("===XML===");
        laurasTransaction.getStatementOutputInXML();
        System.out.println("=========");

        System.out.println();

        //=================================================================================================//

        //the following 3 movies are children movies which are new releases
        Rental johnWick = new RegularMovie("John Wick", true, 1);
        Rental jocker = new RegularMovie("Jocker", true, 2);
        Rental godzilla = new RegularMovie("Godzilla", true, 5);

        //creating new customer called Jonathan
        Customer jonathan = new Customer("Jonathan");

        //Jonathan list of rental
        List<Rental> jonathansRentals = new ArrayList<>();

        //adding movies to Jonathan's list of rental
        jonathansRentals.add(johnWick);
        jonathansRentals.add(jocker);
        jonathansRentals.add(godzilla);

        //Jonathan rents 3 movies "John Wick, Jocker, Godzilla"
        Transaction jonathansTransaction = jonathan.rent(jonathansRentals);

        //Jonathan's transaction statement
        jonathansTransaction.getStatement();
        System.out.println("===XML===");
        jonathansTransaction.getStatementOutputInXML();
        System.out.println("=========");

        System.out.println();



    }
}
