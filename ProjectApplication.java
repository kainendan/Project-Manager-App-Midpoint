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
           DataWriter.saveUsers();
   }

    /**
     * Attempts to log in a user with the given username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return The User object if login is successful, repeat the login process otherwise, exit if the user chooses to.
     */
<<<<<<< HEAD
    public User login(String username, String password) {
<<<<<<< HEAD
        // Implementation details for login.
        // Replace with actual logic.
        return null; // Placeholder return value.
=======
       
        return null; 
>>>>>>> refs/remotes/origin/main
=======
    public void logIn() {
        UserList userList = UserList.getInstance();

        String userName = getField("Enter your username");
        String password = getField("Enter your password");

        if (UserList.isValidLogin(userName, password)) {
            System.out.println("Login successful!");
            user = UserList.getUser(userName);
        } else {
            System.out.println("Invalid login. Please try again.");
            logIn();
        }
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065
    }

    /**
     * Gets a field from the user.
     * @param prompt
     * @return
     */
<<<<<<< HEAD
    public User signUp() {
<<<<<<< HEAD
        // Implementation details for user signup.
        // Replace with actual logic.
        return new User(); // Placeholder return value.
=======
        //return new User();
        return null; 
>>>>>>> refs/remotes/origin/main
=======
    private String getField(String prompt) {
        System.out.println(prompt + ": ");
        return scanner.nextLine();
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065
    }

    /**
     * Retrieves a list of all projects.
     *
     * @return A list of all projects.
     */
<<<<<<< HEAD
    public ArrayList<Project> getAllProjects() {
<<<<<<< HEAD
        // Implementation details for getting all projects.
        // Replace with actual logic.
        return new ArrayList<>(); // Placeholder return value.
=======
      
        return new ArrayList<>(); 
>>>>>>> refs/remotes/origin/main
=======
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
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065
    }

    /**
     * Finds and returns a list of matching projects based on some criteria.
     *
     * @return A list of matching projects.
     */
    public ArrayList<Project> findProject() {
<<<<<<< HEAD
<<<<<<< HEAD
        // Implementation details for finding projects.
        // Replace with actual logic.
        return new ArrayList<>(); // Placeholder return value.
=======
        
        return new ArrayList<>(); 
>>>>>>> refs/remotes/origin/main
=======
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
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065
    }

    /**
     * Opens a project with the given projectId.
     *
     * @param projectName The name of the project to be opened.
     * @return True if the project is opened successfully, false otherwise.
     */
<<<<<<< HEAD
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
=======
    public void openProject() {
        ProjectList projectList = ProjectList.getInstance();
        ArrayList<Project> projects = projectList.getProjectList();

        String projectName = getField("Enter the project name");

        for (Project project : projects) {
            if (project.getProjectName().equals(projectName)) {
                System.out.println(project.getProjectName());
                System.out.println(project.getProjectDesc());
                System.out.println(project.getProjectAuthor());
                System.out.println(project.getId());
            }
        }
    }

>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065

    /**
     * Creates a new task for a project.
     *
     * @return True if the task is created successfully, false otherwise.
     */
<<<<<<< HEAD
    public boolean createTask(String taskName, String taskDesc) {
<<<<<<< HEAD
        // Implementation details for creating a task.
        // Replace with actual logic.
        return false; // Placeholder return value.
=======
    
        return false; 
>>>>>>> refs/remotes/origin/main
    }
=======
    //public Task createTask(){
        //ProjectList projectList = ProjectList.getInstance();
        //ArrayList<Project> projects = projectList.getProjectList();

        //String taskName = getField("Enter the task name");
        //String taskDesc = getField("Enter the task description");
        //String taskAuthor = getField("Enter the task author");

        //column.addTask(taskName, taskDesc, taskAuthor);

        //return new Task(taskName, taskDesc, taskAuthor);
    //}
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065

    /**
     * Creates a new comment for a task.
     *
     * @param commentAuth The user authoring the comment.
     * @param commentText The text of the comment.
     * @return True if the comment is created successfully, false otherwise.
     */
<<<<<<< HEAD
    public boolean createComment(User commentAuth, String commentText) {
<<<<<<< HEAD
        // Implementation details for creating a comment.
        // Replace with actual logic.
        return false; // Placeholder return value.
=======
=======
    public boolean createComment(String commentText) {
>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065
      
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

