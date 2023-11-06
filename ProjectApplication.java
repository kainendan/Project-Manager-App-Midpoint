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
        Scanner input = new Scanner(System.in);
        String projectName = getField("Enter the project name");

        for (Project project : projects) {
            if (project.getProjectName().equals(projectName)) {
                System.out.println("Project Name: "+project.getProjectName());
                System.out.println("Description: "+project.getProjectDesc());
                System.out.println("Project Author: "+project.getProjectAuthor());
                 System.out.println("_____________________________________________");
                project.printBoard();

                if (project != null) {
                    boolean projectMenuRunning = true;
                    while (projectMenuRunning) {
                        System.out.println("What would you like to do in " + project.getProjectName() + "?");
                        System.out.println("1. Show board");
                        System.out.println("2. Move tasks");
                        System.out.println("3. Add comment");
                        System.out.println("4. Show comments");
                        System.out.println("5. Go back");
                         System.out.println("_________________________");
                        int projectChoice = input.nextInt();
                        input.nextLine();

                        switch (projectChoice) {
                            case 1:
                                System.out.println("show board\n___________________");
                                project.printBoard();
                                break;
                            case 2:
                                System.out.println("move task\n___________________");
                                break;
                            case 3:
                                System.out.println("add comm\n___________________");
                                break;
                            case 4:
                                System.out.println("show comm\n___________________");
                                break;
                            case 5:
                                projectMenuRunning = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    }
                } else {
                    System.out.println("Project not found.");
                }


            }

                


        }

         

    }

>>>>>>> 468e4e5847779014b3c9e68b4fcd72847993f065

    /**
     * Creates a new task for a project.
     *
     * @return True if the task is created successfully, false otherwise.
     */
    //public Task createTask(){
        //ProjectList projectList = ProjectList.getInstance();
        //ArrayList<Project> projects = projectList.getProjectList();

        System.out.println("Enter the project name in which you would like to add a task");
        String projectName = scanner.nextLine();
        for (Project project : projects) {
            if (project.getProjectName().equals(projectName)) {
                System.out.println("Project Name: "+project.getProjectName());
                System.out.println("Description: "+project.getProjectDesc());
                System.out.println("Project Author: "+project.getProjectAuthor());
                 System.out.println("_____________________________________________");
                project.printBoard();
            }
        }

        String taskName = getField("Enter the task name");
        String taskDesc = getField("Enter the task description");
        String taskAuthor = getField("Enter the task author");
        String Catego = getField("Enter the task Category");
        Catego = Catego.toUpperCase();
        column = new Column(Catego);
        
        Category cat = Category.BUG;
        System.out.println("Enter the priority.(enter a number)");
        int taskPrio = scanner.nextInt();
        System.out.println("Is it in progress True or false");
        boolean inProgres = scanner.nextBoolean();
        System.out.println("Enter the Privacy.(enter a number)");
        int taskPriv = scanner.nextInt();

        String color = getField("What color would you like it to be. Red, Blue, or Green ");
        if(color.equalsIgnoreCase("red")) {
            color = "ff0000";
        } else if (color.equalsIgnoreCase("Blue")) { 
            color = "0000FF";
        } else if (color.equalsIgnoreCase("Green")) {
            color = "008000";
        } else {
            color = "#000000";
        }


        
        while(checker) {
            String addCom = getField("would you like to add a Comment. Y/N");
                if(addCom.equalsIgnoreCase("Y")) {
                    createComment(comment);
                    checker = false;
                } else if(addCom.equalsIgnoreCase("N"))  {
                    comment.add(new Comment("N/A", "N/A", "N/A"));
                    checker = false;
                } else {
                    checker = true;
                }
        }
       
        column.addTask(taskName, taskDesc, taskAuthor);
        TaskList.addTask(taskName, taskDesc, taskPrio, cat, comment, inProgres, taskPriv, color);

        //return new Task(taskName, taskDesc, taskAuthor);
    //}

    /**
     * Creates a new comment for a task.
     *
     * @param commentAuth The user authoring the comment.
     * @param commentText The text of the comment.
     * @return True if the comment is created successfully, false otherwise.
     */
    public boolean createComment(String commentText) {
      
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

