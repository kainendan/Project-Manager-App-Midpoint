public class User {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int privacyLevel;

    public User(String username, String password, String email, String firstName, String lastName, int privacyLevel) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.privacyLevel = privacyLevel;
    }

    public boolean getPassword() {
        return false;
    }

    public String getFirstName() {
        return null;
    }

    public String getLastName() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    public int getPrivacyLevel() {
        return 0;
    }


}
