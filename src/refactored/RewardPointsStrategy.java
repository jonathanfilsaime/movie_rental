package refactored;

/**
 *
 * interface for frequent reward point strategy
 * all decorators implement this interface
 */
public interface RewardPointsStrategy {
    int computerRewardPoints(int frequentRewardPoints);
}
