// Nick Arboscello
<<<<<<< HEAD
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;

public class User {
=======
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class User {
    private UUID id;
>>>>>>> refs/remotes/origin/main
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int privacyLevel;

    public User(String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
<<<<<<< HEAD
=======
        this.id = UUID.randomUUID();
>>>>>>> refs/remotes/origin/main
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privacyLevel = privacyLevel;
    }
<<<<<<< HEAD
=======
    public User(UUID id, String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privacyLevel = privacyLevel;
    }

>>>>>>> refs/remotes/origin/main

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
<<<<<<< HEAD
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
=======
    //public JSONObject toJSON() {
        //JSONObject jsonUser = new JSONObject();
        //jsonUser.put("userName", userName);
        //jsonUser.put("password", password);
        //jsonUser.put("firstName", firstName);
        //jsonUser.put("lastName", lastName);
        //jsonUser.put("email", email);
        //jsonUser.put("privacyLevel", privacyLevel);
        //return jsonUser;
    //}

>>>>>>> refs/remotes/origin/main
}

