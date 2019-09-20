import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer jonathan = new Customer("Jonathan");

        Rental matrixRental = new ChildrenMovie("Matrix", true, 3);

        List<Rental> jonathanRentals = new ArrayList<>();
        jonathanRentals.add(matrixRental);

        Transaction transaction = jonathan.rent(jonathanRentals);
        System.err.println(transaction.computePrice());
        transaction.getStatement();

//        jonathan.rent(jonathanRentals);
//        jonathan.rent(jonathanRentals);
//        jonathan.rent(jonathanRentals);
//
//        jonathan.getStatementHistory();


    }
}
