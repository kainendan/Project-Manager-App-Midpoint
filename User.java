import java.util.UUID;

public class User {
    private UUID id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int privacyLevel;

    public User(String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privacyLevel = privacyLevel;
    }

    public User(UUID id, String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privacyLevel = privacyLevel;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPrivacyLevel() {
        return Integer.toString(privacyLevel);
    }

    @Override
    public String toString() {
        return "User [userId=" + id + ", username=" + userName + "]";
    }
}
