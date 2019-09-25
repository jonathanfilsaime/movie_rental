package refactored;

import java.util.ArrayList;
import java.util.List;

public class TestRefactoredCode {

    public static void main(String[] args) {

        Customer jonathan = new Customer("Jonathan");

        //CHILDREN MOVIE 1 DAY
        Rental matrixRental1day = new ChildrenMovie("Matrix", false, 1);

        List<Rental> jonathanRentals = new ArrayList<>();

        jonathanRentals.add(matrixRental1day);
        Transaction transaction0 = jonathan.rent(jonathanRentals);
        System.out.println(transaction0.getStatement());
        System.out.println("====XML====");
        transaction0.getStatementOutputInXML();

        System.out.println("==============================================");

        //CHILDREN MOVIE 2 DAYS
        Rental matrixRental3day = new ChildrenMovie("Matrix", false, 3);
        jonathanRentals.add(matrixRental1day);
        Transaction transaction1 = jonathan.rent(jonathanRentals);
        System.out.println(transaction1.getStatement());
        System.out.println("====XML====");
        transaction1.getStatementOutputInXML();

        System.out.println("==============================================");

        //CHILDREN MOVIE 5 DAYS
        Rental matrixRental5day = new ChildrenMovie("Matrix", false, 5);
        jonathanRentals.add(matrixRental5day);
        Transaction transaction2 = jonathan.rent(jonathanRentals);
        System.out.println(transaction2.getStatement());
        System.out.println("====XML====");
        transaction2.getStatementOutputInXML();

        System.out.println("==============================================");


        //REGULAR MOVIE 1 DAYS
        Rental supermanRental1day = new RegularMovie("Superman", false, 1);
        jonathanRentals.add(supermanRental1day);
        Transaction transaction3 = jonathan.rent(jonathanRentals);
        System.out.println(transaction3.getStatement());
        System.out.println("====XML====");
        transaction3.getStatementOutputInXML();

        System.out.println("==============================================");


        //REGULAR MOVIE 2 DAYS
        Rental supermanRental2day = new RegularMovie("Superman", false, 2);
        jonathanRentals.add(supermanRental2day);
        Transaction transaction4 = jonathan.rent(jonathanRentals);
        System.out.println(transaction4.getStatement());
        System.out.println("====XML====");
        transaction4.getStatementOutputInXML();

        System.out.println("==============================================");

        //REGULAR MOVIE 5 DAYS
        Rental supermanRental5day = new RegularMovie("Superman", false, 5);
        jonathanRentals.add(supermanRental5day);
        Transaction transaction5 = jonathan.rent(jonathanRentals);
        System.out.println(transaction5.getStatement());
        System.out.println("====XML====");
        transaction5.getStatementOutputInXML();

        System.out.println("==============================================");

        //NEW RELEASE MOVIE 1 DAYS
        Rental batmanRental1day = new RegularMovie("Batman", true, 1);
        jonathanRentals.add(batmanRental1day);
        Transaction transaction6 = jonathan.rent(jonathanRentals);
        System.out.println(transaction6.getStatement());
        System.out.println("====XML====");
        transaction6.getStatementOutputInXML();

        System.out.println("==============================================");

        //NEW RELEASE MOVIE 3 DAYS
        Rental batmanRental3day = new RegularMovie("Batman", true, 3);
        jonathanRentals.add(batmanRental3day);
        Transaction transaction7 = jonathan.rent(jonathanRentals);
        System.out.println(transaction7.getStatement());
        System.out.println("====XML====");
        transaction7.getStatementOutputInXML();

        System.out.println("==============================================");

        //NEW RELEASE MOVIE 5 DAYS
        Rental batmanRental5day = new RegularMovie("Batman", true, 5);
        jonathanRentals.add(batmanRental5day);
        Transaction transaction8 = jonathan.rent(jonathanRentals);
        System.out.println(transaction8.getStatement());
        System.out.println("====XML====");
        transaction8.getStatementOutputInXML();

        System.out.println("==============================================");

    }
}
