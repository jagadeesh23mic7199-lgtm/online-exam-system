public class Main {
    public static void main(String[] args) {
        System.out.println("Score: " + Scoring.calculateScore(5, 10));
        System.out.println("Login ok: " + Login.login("student", "exam123"));
        System.out.println("Pass mark: " + Config.PASS_MARK);
    }
}
