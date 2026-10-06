public class Scoring {
    public static double calculateScore(int correct, int total) {
        return (correct / (double) total) * 100;
    }
}
