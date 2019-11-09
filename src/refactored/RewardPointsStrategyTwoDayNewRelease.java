package refactored;

/**
 * this decorated extends the abstract strategy decorated
 * and modifies its compute reward point method
 */
public class RewardPointsStrategyTwoDayNewRelease extends StrategyDecorator {

    public RewardPointsStrategyTwoDayNewRelease(RewardPointsStrategy strategy) {
        super(strategy);
    }

    @Override
    public int computerRewardPoints(int frequentRewardPoints) {
         frequentRewardPoints += 1;
         return super.computerRewardPoints(frequentRewardPoints);
    }

}
