// Nick Arboscello
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;

public class User {
<<<<<<< HEAD

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


=======
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int privacyLevel;

    public User(String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privacyLevel = privacyLevel;
    }

    // Getters for the user's properties

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

    public int getPrivacyLevel() {
        return privacyLevel;
    }

    // Convert the User object to a JSON representation
    public JSONObject toJSON() {
        JSONObject jsonUser = new JSONObject();
        jsonUser.put("userName", userName);
        jsonUser.put("password", password);
        jsonUser.put("firstName", firstName);
        jsonUser.put("lastName", lastName);
        jsonUser.put("email", email);
        jsonUser.put("privacyLevel", privacyLevel);
        return jsonUser;
    }

    public static void main(String[] args) {
        User user = new User("john_doe", "password123", "John", "Doe", "john@example.com", 3);

        // Create a JSON object representing the user
        JSONObject jsonUser = user.toJSON();

        // Write the JSON object to a file named "projects.json"
        try (FileWriter fileWriter = new FileWriter("projects.json")) {
            JSONValue.writeJSONString(jsonUser, fileWriter);
            System.out.println("User data written to projects.json.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
>>>>>>> e169168dbc3eba94d71f53d05a0ad50351b14bba
}

