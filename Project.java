import java.util.ArrayList;

public class Project{

    private String projectName;
    private String projectDesc;
    private ArrayList<Comment> projectThread;
    private String projectAuthor;
    private ArrayList<Column> columns;
    private ArrayList<String> tasks;
    private ArrayList<String> directions;
    private User user;

    public Project(String projectName, String projectDesc, String projectAuthor) {
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectAuthor = projectAuthor;
        this.projectThread = new ArrayList<Comment>();
        this.columns = new ArrayList<Column>();
        this.tasks = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }

    public String getProjectName(){
        return projectName;
    }

    public String getProjectDesc(){
        return projectDesc;
    }

    public void getTasks(){
        for (String task : tasks){
            System.out.println(task);
        }
    }
    public String getProjectAuthor() {
        return user.getUserName();
    }

}
