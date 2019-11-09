package refactored;

/**
 * this abstract class implements the interface and
 * holds the RewardPointsStrategy interface
 */
public abstract class StrategyDecorator implements RewardPointsStrategy {
    private RewardPointsStrategy strategy;

    public StrategyDecorator(RewardPointsStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
   public int computerRewardPoints(int frequentRewardPoints) {
       return strategy.computerRewardPoints(frequentRewardPoints);
   }
}
