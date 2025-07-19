import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Yash", "yash@example.com");
        User user2 = null;

        Optional<String> email1 = User.getUserEmail(user1);
        System.out.println("User1 Email: " + email1.orElse("Email not found"));

        Optional<String> email2 = User.getUserEmail(user2);
        System.out.println("User2 Email: " + email2.orElse("Email not found"));
    }
}
