import java.util.ArrayList;
import java.util.UUID;

public class UserList {
    private static UserList userList = null;
    private static ArrayList<User> users = new ArrayList<>();

    /**
     * Constructor for the list of users
     */
    public UserList() {
        users = new ArrayList<User>();
        users = DataLoader.GetUsers();
    }


    /**
     * @return the instance of the userlist
     */
    public static UserList getInstance() {
        if(userList == null) {
            userList = new UserList();
        }
        return userList;
    }

    /**
     * @return the user in the userList
     */
    public ArrayList<User> getUserList() {
        return users;
    }

    /**
     * Add user to the userList
     * @param userName
     * @param password
     * @param firstName
     * @param lastName
     * @param email
     * @param privacyLevel
     */
    public static void addUser(String userName, String password, String firstName, String lastName, String email, int privacyLevel) {
        users.add(new User(UUID.randomUUID(),userName, password, firstName, lastName, email, privacyLevel));
        
    }

    /**
     * Check if user is valid
     * @param userName
     * @param password
     * @return true if the user match the parameters
     */
    public static boolean isValidLogin(String userName, String password) {
        for(User user : users) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get user from the userList
     * @param userName
     * @return the user
     */
    public static User getUser(String userName) {
        for(User user : users) {
            if(user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    /**
     * logs out user and writers user info
     */
    public void logout() {
        DataWriter.saveUsers();
        DataWriter.saveProjects();
        DataWriter.saveTasks();
        System.exit(0);
    }
}
