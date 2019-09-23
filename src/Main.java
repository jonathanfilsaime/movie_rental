import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer jonathan = new Customer("Jonathan");
        Rental matrixRental = new ChildrenMovie("Matrix", false, 3);
        List<Rental> jonathanRentals = new ArrayList<>();
        jonathanRentals.add(matrixRental);
        Transaction transaction0 = jonathan.rent(jonathanRentals);
        transaction0.getStatement();

        //===============================================================================================//

        Customer kendall = new Customer("kendall");
        Rental lalaland = new ChildrenMovie("lalaland", false, 4);
        List<Rental> kendallRentals = new ArrayList<>();
        kendallRentals.add(lalaland);
        Transaction transaction1 = kendall.rent(kendallRentals);
        transaction1.getStatement();

        //===============================================================================================//

        Rental kungFuPanda = new RegularMovie("Kung Fu Panda", true, 2);
        kendallRentals.add(kungFuPanda);
        Transaction transaction2 = kendall.rent(kendallRentals);
        transaction2.getStatement();

        //===============================================================================================//

        Customer kathy = new Customer("Kathy");
        RegularMovie paddington2 = new RegularMovie("Paddington 2", false, 1);
        List<Rental> kathyRentals = new ArrayList<>();
        kathyRentals.add(paddington2);
        Transaction transaction3 = kathy.rent(kathyRentals);
        transaction3.getStatement();

        //===============================================================================================//

        Customer bob = new Customer("Bob");
        RegularMovie up = new RegularMovie("Up", false, 5);
        List<Rental> bobRentals = new ArrayList<>();
        bobRentals.add(up);
        Transaction transaction4 = bob.rent(bobRentals);
        transaction4.getStatement();

        //===============================================================================================//

    }
}
