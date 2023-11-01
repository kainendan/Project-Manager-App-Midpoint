import java.util.ArrayList;

public class ProjectList {
    private static ProjectList projectList = null;
    private static ArrayList<Project> projects = new ArrayList<>();

    /**
     * Constructor for the list of projects
     */
    public ProjectList() {
        projects = new ArrayList<Project>();
        projects = DataLoader.GetProjects();
    }


    /**
     * @return the instance of the project list
     */
    public static ProjectList getInstance() {
        if(projectList == null) {
            projectList = new ProjectList();
        }
        return projectList;
    }

    /**
     * @return the project in the projectList
     */
    public ArrayList<Project> getProjectList() {
        return projects;
    }

    /**
     * Add project to the projectList
     * @param projectName
     * @param projectDesc
     * @param projectAuthor
     */
    public static void addProject(String projectName, String projectDesc, String projectAuthor) {
        projects.add(new Project(projectName, projectDesc, projectAuthor));
    }

}
