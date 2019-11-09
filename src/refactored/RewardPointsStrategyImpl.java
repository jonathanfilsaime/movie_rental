package refactored;

/**
 * this is the base case
 * all rental get 1 point
 */
public class RewardPointsStrategyImpl implements RewardPointsStrategy {

    @Override
    public int computerRewardPoints(int frequentRewardPoints) {
        return ++frequentRewardPoints;
    }
}
