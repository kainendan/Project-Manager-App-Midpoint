import java.util.ArrayList;

public abstract class Task extends Column{
    private String taskName;
    private String taskDesc;
    private int taskPrio;
    private Category taskCategory;
    private ArrayList<Comment> taskThread;
    private boolean inProgress;
    private int taskPrivacy;
    private String color;

    public Task(String taskName, String taskDesc, int taskPrio, Category taskCategory, ArrayList<Comment> taskThread, boolean inProgress, int taskPrivacy, String color) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.taskPrio = taskPrio;
        this.taskCategory = taskCategory;
        this.taskThread = taskThread;
        this.inProgress = inProgress;
        this.taskPrivacy = taskPrivacy;
        this.color = color;
    }

    public void markComplete() {
        // TODO implement here
    }

    public boolean checkPrivacy(User userType) {
        // TODO implement here
        return false;
    }
}
