import java.util.ArrayList;
import java.util.UUID;

public class Project{

    private UUID id;
    private String projectName;
    private String projectDesc;
    private ArrayList<Comment> projectThread;
    private String projectAuthor;
    private ArrayList<Column> columns;
    private ArrayList<String> tasks;
    private ArrayList<String> directions;
    private User user;

    public Project(String projectName, String projectDesc, String projectAuthor) {
        this.id = UUID.randomUUID();
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectAuthor = projectAuthor;
        this.projectThread = new ArrayList<Comment>();
        this.columns = new ArrayList<Column>();
        this.tasks = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }
    public Project(UUID id, String projectName, String projectDesc, String projectAuthor) {
        this.id = id;
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectAuthor = projectAuthor;
        this.projectThread = new ArrayList<Comment>();
        this.columns = new ArrayList<Column>();
        this.tasks = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }


    public UUID getId() {
        return id;
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

    @Override
    public String toString() {
        return "Project [ProjectId=" + UUID.randomUUID() + ", ProjectName=" + projectName + "]";
    }
}
