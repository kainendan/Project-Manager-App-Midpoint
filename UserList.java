import java.util.ArrayList;

public class UserList {
    public static UserList userList;
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<User>();
    }

    public static UserList getInstance() {
        if(userList == null) {
            System.out.println("Creating a new user ");
            userList = new UserList();
        }
        return null;
    }

    public User getUser(String project) {
        // TODO implement here
    }
}