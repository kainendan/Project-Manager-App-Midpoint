import java.util.ArrayList;

public abstract class Task extends Column{
    // Class variables
    private String taskName;
    private String taskDesc;
    private int taskPrio;
    private Category taskCategory;
    private ArrayList<Comment> taskThread;
    private boolean inProgress;
    private int taskPrivacy;
    private String color;

/**
 * Constructor for Task
 * @param taskName Name of the Task
 * @param taskDesc Description of the Task
 * @param taskPrio Priority of the Task
 * @param taskCategory Category of the Task
 * @param taskThread Thread of Comments for the Task
 * @param inProgress Whether the Task is in progress or not
 * @param taskPrivacy Privacy level of the Task
 * @param color Color of the Task
 */
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

/**
 * Changes inProgress variable to false, representing that the Task is complete
 */
    public void markComplete() {
        inProgress = false;
    }

/**
 * Checks the privacy level of the User and compares it to the privacy level of the Task
 * @param userType The User being checked upon to see if they have the correct privacy level
 * @return boolean whether they have the correct privacy level or not
 */
    public boolean checkPrivacy(User userType) {
        /*
        if(userType.getPrivacy() == taskPrivacy)
            return true;
        else
            return false;
        */
        return false;
    }
}
