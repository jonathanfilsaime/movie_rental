package refactored;

/**
 * this decorated extends the abstract strategy decorated
 * and modifies its compute reward point method
 */
public class RewardPointStrategyAgeAndNewRelease extends StrategyDecorator {
    private RewardPointsStrategy strategy;

    public RewardPointStrategyAgeAndNewRelease(RewardPointsStrategy strategy) {
        super(strategy);
    }

    @Override
    public int computerRewardPoints(int frequentRewardPoints) {
        return super.computerRewardPoints(frequentRewardPoints) * 2;
    }
}
