// RJ Allen
// This is to possible help with adding task for UI and dataWriter
import java.util.ArrayList;
public class TaskList {
    private static TaskList taskList = null;
    private static ArrayList<Task> tasks = new ArrayList<>();

    public TaskList() {
        tasks = new ArrayList<Task>();
        tasks = DataLoader.GetTask();
    }
    
    public static TaskList getInstance() {
        if(taskList == null) {
            taskList = new TaskList();
        }
        return taskList;
    }

    public static void addTask(String taskName, String taskDesc, int taskPrio, Category taskCategory, ArrayList<Comment> taskThread, boolean inProgress, int taskPrivacy, String color) {
        tasks.add(new Task(taskName, taskDesc, taskPrio, taskCategory, taskThread, inProgress, taskPrivacy, color));
    }
}
