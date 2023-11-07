import java.util.ArrayList;


public class ProjectList {
    private static ProjectList projectList = null;
    private static ArrayList<Project> projects = new ArrayList<>();
    private static ArrayList<Task> tasks = new ArrayList<>();

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
     * adds project to the projectList, tester checks name, description, and author to see project was created
     */
    public static void addProject(String projectName, String projectDesc, String projectAuthor) {
        projects.add(new Project(projectName, projectDesc, projectAuthor));
    }

    // adds task, tester checks all variables to see task was created
    public static void addTask(String taskName, String taskDesc, int taskPrio, Category taskCategory, ArrayList<Comment> taskThread, boolean inProgress, int taskPrivacy, String color) {
        tasks.add(new Task(taskName, taskDesc, taskPrio, taskCategory, taskThread, inProgress, taskPrivacy, color));
    }

    public ArrayList<Task> geTasksList() {
        return tasks;
    }

}
