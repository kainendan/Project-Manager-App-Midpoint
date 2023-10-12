//Nick Arboscello
import java.util.ArrayList;

/**
 * The ProjectApplication class represents the main application for managing projects, users, and related functionality.
 */
public class ProjectApplication {
    private ProjectList projectList;
    private UserList userList;
    private User user;
  
    /**
     * Constructs a new ProjectApplication object.
     */
    public ProjectApplication() {
        projectList = new ProjectList(); // Initialize projectList
        userList = new UserList(); // Initialize userList
        user = null; // Initialize user
    }

    /**
     * Attempts to log in a user with the given username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return The User object if login is successful, or null if login fails.
     */
    public User login(String username, String password) {
       
        return null; 
    }

    /**
     * Creates a new user account.
     *
     * @return The newly created User object.
     */
    public User signUp() {
        
        return new User(); 
    }

    /**
     * Retrieves a list of all projects.
     *
     * @return A list of all projects.
     */
    public ArrayList<Project> getAllProjects() {
      
        return new ArrayList<>(); 
    }

    /**
     * Finds and returns a list of matching projects based on some criteria.
     *
     * @return A list of matching projects.
     */
    public ArrayList<Project> findProject() {
        
        return new ArrayList<>(); 
    }

    /**
     * Creates a new user account.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @return The newly created User object.
     */
    public User createAccount(String firstName, String lastName) {
      
        return new User(); 
    }

    /**
     * Creates a new project.
     *
     * @param projectName The name of the project.
     * @param projectDesc The description of the project.
     * @return True if the project is created successfully, false otherwise.
     */
    public boolean createProject(String projectName, String projectDesc) {
     
        return false; 
    }

    /**
     * Creates a new task for a project.
     *
     * @param taskName  The name of the task.
     * @param taskDesc  The description of the task.
     * @return True if the task is created successfully, false otherwise.
     */
    public boolean createTask(String taskName, String taskDesc) {
    
        return false; 
    }

    /**
     * Creates a new comment for a task.
     *
     * @param commentAuth The user authoring the comment.
     * @param commentText The text of the comment.
     * @return True if the comment is created successfully, false otherwise.
     */
    public boolean createComment(User commentAuth, String commentText) {
      
        return false;
    }

    /**
     * Edits a task with the given taskId.
     *
     * @param taskId The ID of the task to be edited.
     * @param task   The updated task information.
     */
    public void editTask(int taskId, ArrayList<String> task) {
       
    }
}
