// Nick Arboscello
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;

public class User {
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

}

