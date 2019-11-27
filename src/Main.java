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
        Item aladdin = new ChildrenMovie("Aladdin", false, 1);
        Item up = new ChildrenMovie("Up", false, 3);
        Item frozen = new ChildrenMovie("Frozen", false, 5);

        //creating new customer called Christopher
        Customer christopher = new Customer("Christopher", 4);

        //Christopher list of rental
        List<Item> christophersItems = new ArrayList<>();

        //adding movies to Christopher's list of rental
        christophersItems.add(aladdin);
        christophersItems.add(up);
        christophersItems.add(frozen);

        //Christopher rents 3 movies "aladdin, Frozen, Up"
        Transaction christophersTransaction = christopher.checkout(christophersItems);

        //Christopher's transaction statement
        System.out.println(christophersTransaction.getStatement());
        System.out.println("===XML===");
        christophersTransaction.getStatementOutputInXML();
        System.out.println("=========");

        //expected 3 points
        System.out.println();

        //=================================================================================================//

        Item sudoku = new Book("Sudoku");

        Customer jeff =  new Customer("Jeff", 35);

        List<Item> jeffsItems = new ArrayList<>();
        jeffsItems.add(sudoku);

        Transaction jeffTransactions = jeff.checkout(jeffsItems);

        System.out.println(jeffTransactions.getStatement());

        Item michaelJackson = new CompactDisc("Thriller");
        Item madonna = new CompactDisc("immaculate", 2);

        Customer kendall = new Customer("Kendall", 28);

        List<Item> kendallsItems = new ArrayList<>();

        kendallsItems.add(michaelJackson);
        kendallsItems.add(madonna);

        Transaction kendallsTransaction = kendall.checkout(kendallsItems);

        System.out.println(kendallsTransaction.getStatement());








//        //the following 3 movies are regular movies which are not new releases
//        Rental forrestGump = new RegularMovie("Forest Gump", false, 1);
//        Rental sandlot = new RegularMovie("The sandlot", false, 2);
//        Rental terminator = new RegularMovie("The Terminator", false, 5);
//
//        //creating new customer called Fiona
//        Customer fiona = new Customer("Fiona", 5);
//
//        //Fiona list of rental
//        List<Rental> fionasRentals = new ArrayList<>();
//
//        //adding movies to Fiona's list of rental
//        fionasRentals.add(forrestGump);
//        fionasRentals.add(sandlot);
//        fionasRentals.add(terminator);
//
//        //Fiona rents 3 movies "Forest Gump, The sandlot, The Terminator"
//        Transaction fionasTransaction = fiona.checkout(fionasRentals);
//
//        //fiona's transaction statement
//        System.out.println(fionasTransaction.getStatement());
//        System.out.println("===XML===");
//        fionasTransaction.getStatementOutputInXML();
//        System.out.println("=========");
//
//        System.out.println();
//
//        //=================================================================================================//
//
//        //the following 3 movies are children movies which are new releases
//        Rental dumbo = new ChildrenMovie("Dumbo", true, 1);
//        Rental toyStory = new ChildrenMovie("Toy Story", true, 3);
//        Rental lionKing = new RegularMovie("The Lion King", true, 5);
//
//        //creating new customer called Laura
//        Customer laura = new Customer("Laura", 16);
//
//        //laura list of rental
//        List<Rental> laurasRentals = new ArrayList<>();
//
//        //adding movies to Laura's list of rental
//        laurasRentals.add(dumbo);
//        laurasRentals.add(toyStory);
//        laurasRentals.add(lionKing);
//
//        //Laura rents 3 movies "Dumbo, Toy Story, The Lion King"
//        Transaction laurasTransaction = laura.checkout(laurasRentals);
//
//        //Laura's transaction statement
//        System.out.println(laurasTransaction.getStatement());
//        System.out.println("===XML===");
//        laurasTransaction.getStatementOutputInXML();
//        System.out.println("=========");
//
//        System.out.println();
//
//        //=================================================================================================//
//
//        //the following 3 movies are children movies which are new releases
//        Rental johnWick = new ChildrenMovie("John Wick", true, 1);
//        Rental joker = new RegularMovie("Joker", true, 1);
//        Rental godzilla = new RegularMovie("Godzilla", true, 5);
//
//        //creating new customer called Jonathan
//        Customer jonathan = new Customer("Jonathan", 19);
//
//        //Jonathan list of rental
//        List<Rental> jonathansRentals = new ArrayList<>();
//
//        //adding movies to Jonathan's list of rental
//        jonathansRentals.add(johnWick);
//        jonathansRentals.add(joker);
//        jonathansRentals.add(godzilla);
//
//        //Jonathan rents 3 movies "John Wick, Jocker, Godzilla"
//        Transaction jonathansTransaction = jonathan.checkout(jonathansRentals);
//
//        //Jonathan's transaction statement
//        System.out.println(jonathansTransaction.getStatement());
//        System.out.println("===XML===");
//        jonathansTransaction.getStatementOutputInXML();
//        System.out.println("=========");
//
//        System.out.println();



    }
}
