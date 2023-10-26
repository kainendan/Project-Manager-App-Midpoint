//Nick Arboscello
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The ProjectApplication class represents the main application for managing projects, users, and related functionality.
 */
public class ProjectApplication {
    private ProjectList projectList;
    private UserList userList;
    private User user;
  
    private Scanner scanner = new Scanner(System.in);

    /**
     * Constructs a new ProjectApplication object.
     */
    public ProjectApplication() {
        projectList = new ProjectList(); // Initialize projectList
        userList = new UserList(); // Initialize userList
        user = null; // Initialize user
    }

    /**
     * Creates a new user account.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @return The newly created User object.
     */
    public void signUp() {
        UserList userList = UserList.getInstance();

           String userName = getField("Enter your username");
           String password = getField("Enter your password");
           String firstName = getField("Enter your first name");
           String lastName = getField("Enter your last name");
           String email = getField("Enter your email");
           int privacyLevel = Integer.parseInt(getField("Enter your privacy level"));

           UserList.addUser(userName, password, firstName, lastName, email, privacyLevel);
   }

    /**
     * Attempts to log in a user with the given username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return The User object if login is successful, or null if login fails.
     */
    public void logIn() {
        UserList userList = UserList.getInstance();

        String userName = getField("Enter your username");
        String password = getField("Enter your password");

        if (userList.isValidLogin(userName, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    /**
     * Gets a field from the user.
     * @param prompt
     * @return
     */
    private String getField(String prompt) {
        System.out.println(prompt + ": ");
        return scanner.nextLine();
    }

    /**
     * Retrieves a list of all projects.
     *
     * @return A list of all projects.
     */
    public void getAllProjects() {
        ProjectList projectList = ProjectList.getInstance();
        ArrayList<Project> projects = projectList.getProjectList();

        for (Project project : projects) {
            System.out.println(project.getProjectName());
        }
    }

    /**
     * Creates a new project.
     *
     * @return True if the project is created successfully, false otherwise.
     */
    public Project createProject() {
        ProjectList projectList = ProjectList.getInstance();

        String projectName = getField("Enter the project name");
        String projectDesc = getField("Enter the project description");
        String projectAuthor = getField("Enter the project author");

        ProjectList.addProject(projectName, projectDesc, projectAuthor);

        return new Project(projectName, projectDesc, projectAuthor);
    }

    /**
     * Finds and returns a list of matching projects based on some criteria.
     *
     * @return A list of matching projects.
     */
    public ArrayList<Project> findProject() {
        ProjectList projectList = ProjectList.getInstance();
        ArrayList<Project> projects = projectList.getProjectList();

        String projectName = getField("Enter the project name");

        ArrayList<Project> matchingProjects = new ArrayList<Project>();

        for (Project project : projects) {
            if (project.getProjectName().equals(projectName)) {
                matchingProjects.add(project);
            }
        }

        return matchingProjects;
    }


    /**
     * Creates a new task for a project.
     *
     * @param taskName  The name of the task.
     * @param taskDesc  The description of the task.
     * @return True if the task is created successfully, false otherwise.
     */
    public boolean createTask(String taskName, String taskDesc) {
        ProjectList projectList = ProjectList.getInstance();
        ArrayList<Project> projects = projectList.getProjectList();

        String projectName = getField("Enter the project name");

        for (Project project : projects) {
            if (project.getProjectName().equals(projectName)) {
                project.addTask(taskName, taskDesc);
                return true;
            }
        }

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
