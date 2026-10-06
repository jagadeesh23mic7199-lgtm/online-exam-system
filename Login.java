public class Login {
    public static boolean login(String username, String password) {
        return "student".equals(username) && "exam123".equals(password);
    }
}
