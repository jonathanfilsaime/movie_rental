package refactored;

/**
 * this decorated extends the abstract strategy decorated
 * and modifies its compute reward point method
 */
public class RewardPointsStrategyTwoCategories extends StrategyDecorator {

    public RewardPointsStrategyTwoCategories(RewardPointsStrategy strategy) {
        super(strategy);
    }

    @Override
    public int computerRewardPoints(int frequentRewardPoints) {
        return super.computerRewardPoints(frequentRewardPoints) * 2;
    }
}
