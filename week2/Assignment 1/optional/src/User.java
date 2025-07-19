import java.util.Optional;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public static Optional<String> getUserEmail(User user) {
        return Optional.ofNullable(user)
                .map(User::getEmail);
    }
}