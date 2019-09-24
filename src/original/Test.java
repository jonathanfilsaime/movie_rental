package original;

public class Test {

    public static void main(String[] args) {
	// write your code here


        Customer jonathan = new Customer("jonathan");

        //CHILDREN MOVIE////////////////
        Movie matrix = new Movie("Matrix", Movie.CHILDRENS);

        //CHILDREN MOVIE 1 DAY
        Rental matrixRental1day = new Rental(matrix, 1);
        jonathan.addRental(matrixRental1day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //CHILDREN MOVIE 2 DAYS
        Rental matrixRental3days = new Rental(matrix, 3);
        jonathan.addRental(matrixRental3days);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //CHILDREN MOVIE 5 DAYS
        Rental matrixRental5days = new Rental(matrix, 5);
        jonathan.addRental(matrixRental5days);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //REGULAR MOVIE////////////////
        Movie superman = new Movie("Superman", Movie.REGULAR);

        //REGULAR MOVIE 1 DAYS
        Rental superman1day = new Rental(superman, 1);
        jonathan.addRental(superman1day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //REGULAR MOVIE 2 DAYS
        Rental superman2day = new Rental(superman, 2);
        jonathan.addRental(superman2day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //REGULAR MOVIE 5 DAYS
        Rental superman5day = new Rental(superman, 5);
        jonathan.addRental(superman5day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //NEW RELEASE MOVIE////////////////
        Movie batman = new Movie("Batman", Movie.NEW_RELEASE);

        //NEW RELEASE MOVIE 1 DAYS
        Rental batman1day = new Rental(batman, 1);
        jonathan.addRental(batman1day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //NEW RELEASE MOVIE 3 DAYS
        Rental batman3day = new Rental(batman, 3);
        jonathan.addRental(batman3day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");

        //NEW RELEASE MOVIE 5 DAYS
        Rental batman5day = new Rental(batman, 5);
        jonathan.addRental(batman5day);
        System.err.println(jonathan.statement());

        System.err.println("==============================================");












    }
}
