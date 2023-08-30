package relationaloperators3;

public class RelationalOperators3 {
    
    public static void main(String[] args) {
        double recommendWaterTake = 8;
        double daysInChallenge = 30;
        double yourWaterTake = 235.5;
        double totalRecommend = recommendWaterTake * daysInChallenge;
        boolean ChallengeComplete = yourWaterTake >= totalRecommend;
        System.out.println(ChallengeComplete);
    }
    
}
