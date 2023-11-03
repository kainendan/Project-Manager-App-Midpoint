import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// RJ Allen
// This is to possible help with adding task for UI and dataWriter
import java.util.ArrayList;

public class TaskList {
    private static TaskList taskList = null;
    private static ArrayList<Task> tasks = new ArrayList<>();

    
     /**
     * Constructor for the list of tasks
     */
    
    public TaskList() {
        tasks = new ArrayList<Task>();
        tasks = DataLoader.GetTask();
    }
    
     /**
     * @return the instance of the tasklist
     */
    @Test
    public static TaskList getInstance() {
        if(taskList == null) {
            taskList = new TaskList();
        }
        return taskList;
    }

     /**
     * @return the task in the tasklist
     */
    @Test
    public ArrayList<Task> geTasksList() {
        return tasks;
    }

    /**
     * add task to the taskList
     * @param taskName
     * @param taskDesc
     * @param taskPrio
     * @param taskCategory
     * @param taskThread
     * @param inProgress
     * @param taskPrivacy
     * @param color
     */
    @Test
    public static void addTask(String taskName, String taskDesc, int taskPrio, Category taskCategory, ArrayList<Comment> taskThread, boolean inProgress, int taskPrivacy, String color) {
        tasks.add(new Task(taskName, taskDesc, taskPrio, taskCategory, taskThread, inProgress, taskPrivacy, color));
    }
}
