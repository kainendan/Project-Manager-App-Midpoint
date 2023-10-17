import java.util.ArrayList;

public class UserList {
    private static UserList userList = null;
    private static ArrayList<User> users = new ArrayList<>();

    private UserList() {
        users = new ArrayList<User>();
    }

    public static UserList getInstance() {
        if(userList == null) {
            System.out.println("Creating a new user account: ");
            userList = new UserList();
        }
        return userList;
    }

    public ArrayList<User> getUserList() {
        return users;
    }

    public static void addUser(String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        users.add(new User(userName, password, firstName, lastName, email, privacyLevel));
    }

    public void logout() {
        DataWriter.saveUsers();
    }
}
