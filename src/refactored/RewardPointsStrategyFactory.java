package refactored;


/**
 * factory for choosing a rewards point strategy
 * the strategy is composed using the decorator pattern
 */
public class RewardPointsStrategyFactory {


    public RewardPointsStrategy create(Customer customer, Rental rental){

        boolean hasTwoCategory = hasTwoOrMoreCategories(customer);
        boolean isNewRelease = rental.getMovie().isNewRelease();
        boolean rentedForMoreThanOneDay = rental.getDaysRented() > 1;
        boolean ageIs18to22A = (customer.getAge() >= 18 && customer.getAge() <= 22);


        if (hasTwoCategory && !(isNewRelease && rentedForMoreThanOneDay) && !ageIs18to22A) {
            return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl());

        }

        if (hasTwoCategory && isNewRelease && rentedForMoreThanOneDay && !ageIs18to22A) {
           return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyTwoDayNewRelease(new RewardPointsStrategyImpl()));

        }

        if (hasTwoCategory && !isNewRelease && rentedForMoreThanOneDay && !ageIs18to22A) {
           return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl());

        }

        if (hasTwoCategory && isNewRelease && !rentedForMoreThanOneDay && !ageIs18to22A) {
           return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl());
        }

        if (!hasTwoCategory && isNewRelease && rentedForMoreThanOneDay && !ageIs18to22A) {
           return new RewardPointsStrategyTwoDayNewRelease(new RewardPointsStrategyImpl());
        }

        if (hasTwoCategory && !isNewRelease && !rentedForMoreThanOneDay && ageIs18to22A) {
            return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl());

        }

        if (hasTwoCategory && isNewRelease && rentedForMoreThanOneDay && ageIs18to22A) {
            return new RewardPointStrategyAgeAndNewRelease(new RewardPointsStrategyTwoCategories(new RewardPointsStrategyTwoDayNewRelease(new RewardPointsStrategyImpl())));

        }

        if (hasTwoCategory && !isNewRelease && rentedForMoreThanOneDay && ageIs18to22A) {
            return new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl());

        }

        if (hasTwoCategory && isNewRelease && !rentedForMoreThanOneDay && ageIs18to22A) {
            return new RewardPointStrategyAgeAndNewRelease(new RewardPointsStrategyTwoCategories(new RewardPointsStrategyImpl()));
        }

        if (!hasTwoCategory && isNewRelease && rentedForMoreThanOneDay && ageIs18to22A) {
            return new RewardPointStrategyAgeAndNewRelease(new RewardPointsStrategyTwoDayNewRelease(new RewardPointsStrategyImpl()));
        }

       return new RewardPointsStrategyImpl();

    }

    public boolean hasTwoOrMoreCategories(Customer customer) {

        int index = customer.getTransactionHistory().size() - 1;

        int childrenCounter = 0;
        int regularCounter = 0;

        for( int i =0 ; i < customer.getTransactionHistory().get(index).getRentals().size(); i++){

            if(customer.getTransactionHistory().get(index).getRentals().get(i).getItem().getClass().getName().equalsIgnoreCase("refactored.ChildrenMovie")){
                childrenCounter++;
            }

            if(customer.getTransactionHistory().get(index).getRentals().get(i).getItem().getClass().getName().equalsIgnoreCase("refactored.RegularMovie")){
                regularCounter++;
            }
        }

        return (childrenCounter > 0 && regularCounter > 0);
    }

}
