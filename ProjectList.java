import java.util.ArrayList;

public class ProjectList {
    private static ProjectList projectList = null;
    private static ArrayList<Project> projects = new ArrayList<>();

    /**
     * Constructor for the list of users
     */
    private ProjectList() {
        projects = new ArrayList<Project>();
        projects = DataLoader.GetProjects();
    }


    /**
     * @return the instance of the userlist
     */
    public static ProjectList getInstance() {
        if(projectList == null) {
            System.out.println("Creating a new user account: ");
            projectList = new ProjectList();
        }
        return projectList;
    }

    /**
     * @return the user in the userList
     */
    public ArrayList<Project> getProjectList() {
        return projects;
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
    public static void addProject() {
        projects.add(new Project());
    }


}
