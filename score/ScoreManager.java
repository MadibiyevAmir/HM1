package score;

public class ScoreManager {
    private int score;

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}
