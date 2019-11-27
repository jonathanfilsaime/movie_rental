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

        Store store = new Store();

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
        Transaction christophersTransaction = store.checkout(christopher, christophersItems);

        System.out.println(store.getStatement(christophersTransaction));
        System.out.println(store.getStatement(christophersTransaction));

        //=================================================================================================//

        Item sudoku = new Book("Sudoku");
        Item crossWord = new Book("Crossword", 6);

        Customer jeff =  new Customer("Jeff", 35);

        List<Item> jeffsItems = new ArrayList<>();
        jeffsItems.add(sudoku);
        jeffsItems.add(crossWord);

        Transaction jeffTransactions = store.checkout(jeff, jeffsItems);

        System.out.println(store.getStatement(jeffTransactions));

        //=================================================================================================//

        Item michaelJackson = new CompactDisc("Thriller");
        Item madonna = new CompactDisc("immaculate", 2);

        Customer kendall = new Customer("Kendall", 28);

        List<Item> kendallsItems = new ArrayList<>();

        kendallsItems.add(michaelJackson);
        kendallsItems.add(madonna);

        Transaction kendallsTransaction = store.checkout(kendall, kendallsItems);

        System.out.println(store.getStatement(kendallsTransaction));


        //the following 3 movies are regular movies which are not new releases
        Item forrestGump = new RegularMovie("Forest Gump", false);
        Item sandlot = new ChildrenMovie("The sandlot", false, 2);
        Item terminator = new RegularMovie("The Terminator", false, 5);

        //creating new customer called Fiona
        Customer fiona = new Customer("Fiona", 5);

        //Fiona list of rental
        List<Item> fionasRentals = new ArrayList<>();

        //adding movies to Fiona's list of rental
        fionasRentals.add(forrestGump);
        fionasRentals.add(sandlot);
        fionasRentals.add(terminator);

        //Fiona rents 3 movies "Forest Gump, The sandlot, The Terminator"
        Transaction fionasTransaction = store.checkout(fiona, fionasRentals);

        System.out.println(store.getStatement(fionasTransaction));

//        //=================================================================================================//
//

        Item console1 = new PSFour("PS4 250 GB");
        Item console2 = new PSFour("PS4 1 TB", 50);

        Customer mister = new Customer("mister", 80);

        List<Item> mistersItems = new ArrayList<>();

        mistersItems.add(console1);
        mistersItems.add(console2);

        Transaction mistersTransaction = store.checkout(mister, mistersItems);

        System.out.println(store.getStatement(mistersTransaction));

//        //=================================================================================================//


        Item rocketLeague = new VideoGames("Rocket League");
        Item bomberMan = new VideoGames("Bomber 1", 50);
        Item bomberMan2 = new VideoGames("Bomber 2", 50);

        Customer cat = new Customer("cat", 1);

        List<Item> catItems = new ArrayList<>();

        catItems.add(rocketLeague);
        catItems.add(bomberMan);
        catItems.add(bomberMan2);

        Transaction catsTransactions = store.checkout(cat, catItems);

        System.out.println(store.getStatement(catsTransactions));

        //=================================================================================================//

        Item xBox = new Xbox("XBOXXXXXXXXXXXX");

        Customer durp = new Customer("durp", 16);

        List<Item> durpItems = new ArrayList<>();

        durpItems.add(xBox);

        Transaction durpTransactions = store.checkout(durp, durpItems);

        System.out.println(store.getStatement(durpTransactions));

    }
}
