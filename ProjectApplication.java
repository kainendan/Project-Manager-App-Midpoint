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
<<<<<<< HEAD
        // Implementation details for login.
        // Replace with actual logic.
        return null; // Placeholder return value.
=======
       
        return null; 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Creates a new user account.
     *
     * @return The newly created User object.
     */
    public User signUp() {
<<<<<<< HEAD
        // Implementation details for user signup.
        // Replace with actual logic.
        return new User(); // Placeholder return value.
=======
        //return new User();
        return null; 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Retrieves a list of all projects.
     *
     * @return A list of all projects.
     */
    public ArrayList<Project> getAllProjects() {
<<<<<<< HEAD
        // Implementation details for getting all projects.
        // Replace with actual logic.
        return new ArrayList<>(); // Placeholder return value.
=======
      
        return new ArrayList<>(); 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Finds and returns a list of matching projects based on some criteria.
     *
     * @return A list of matching projects.
     */
    public ArrayList<Project> findProject() {
<<<<<<< HEAD
        // Implementation details for finding projects.
        // Replace with actual logic.
        return new ArrayList<>(); // Placeholder return value.
=======
        
        return new ArrayList<>(); 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Creates a new user account.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @return The newly created User object.
     */
    public User createAccount(String firstName, String lastName) {
<<<<<<< HEAD
        // Implementation details for creating a user account.
        // Replace with actual logic.
        return new User(); // Placeholder return value.
=======
        //return new User();
        return null;
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Creates a new project.
     *
     * @param projectName The name of the project.
     * @param projectDesc The description of the project.
     * @return True if the project is created successfully, false otherwise.
     */
    public boolean createProject(String projectName, String projectDesc) {
<<<<<<< HEAD
        // Implementation details for creating a project.
        // Replace with actual logic.
        return false; // Placeholder return value.
=======
     
        return false; 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Creates a new task for a project.
     *
     * @param taskName  The name of the task.
     * @param taskDesc  The description of the task.
     * @return True if the task is created successfully, false otherwise.
     */
    public boolean createTask(String taskName, String taskDesc) {
<<<<<<< HEAD
        // Implementation details for creating a task.
        // Replace with actual logic.
        return false; // Placeholder return value.
=======
    
        return false; 
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Creates a new comment for a task.
     *
     * @param commentAuth The user authoring the comment.
     * @param commentText The text of the comment.
     * @return True if the comment is created successfully, false otherwise.
     */
    public boolean createComment(User commentAuth, String commentText) {
<<<<<<< HEAD
        // Implementation details for creating a comment.
        // Replace with actual logic.
        return false; // Placeholder return value.
=======
      
        return false;
>>>>>>> refs/remotes/origin/main
    }

    /**
     * Edits a task with the given taskId.
     *
     * @param taskId The ID of the task to be edited.
     * @param task   The updated task information.
     */
    public void editTask(int taskId, ArrayList<String> task) {
<<<<<<< HEAD
        // Implementation details for editing a task.
        // Replace with actual logic.
=======
       
>>>>>>> refs/remotes/origin/main
    }
}

