import java.util.ArrayList;

public class ProjectList {
    private static ProjectList projectList;
    private ArrayList<Project> project;


    public ProjectList(){
        //project = new ArrayList<Project>
    }

    public ProjectList getInstance(){
       return projectList;
    }

    public ArrayList<Project> getProject(String Project){
        return project;
    }

}
