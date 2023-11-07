import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * This class is used to create a column object, which is a list of task objects.
 */
public class Column {
    public ArrayList<Task> backlogList() {
        ArrayList<Task> backlogList = new ArrayList<Task>();
        return backlogList;
    }

    public ArrayList<Task> todoList() {
        ArrayList<Task> todoList = new ArrayList<Task>();
        return todoList;
    }

    public ArrayList<Task> inProgressList() {
        ArrayList<Task> inProgressList = new ArrayList<Task>();
        return inProgressList;
    }

    public ArrayList<Task> completedList() {
        ArrayList<Task> completedList = new ArrayList<Task>();
        return completedList;
    }
    
    private String columnName;
    private ArrayList<Task> tasks;

    /**
     * Constructor for the column object
     * @param columnName
     */
    public Column(String columnName) {
        this.columnName = columnName;
        this.tasks = new ArrayList<Task>();
    }

    /**
     * @return the column name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @return the list of tasks
     */
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    /**
     * Add a task to the column
     * @param taskName
     * @param taskDesc
     * @param taskAuthor
     */
    @Test
    public void addTask(String taskName, String taskDesc, String taskAuthor) {
        tasks.add(new Task(taskName, taskDesc, 0, Category.BUG, null, false, 0, taskAuthor));
    }

    /**
     * Remove a task from the column
     * @param taskName
     */
    @Test
    public void removeTask(String taskName) {
        for(Task task : tasks) {
            if(task.getTaskName().equals(taskName)) {
                tasks.remove(task);
                break;
            }
        }
    }

    /**
     * @return the string representation of the column
     */
    @Override
    public String toString() {
        return "Column [columnName=" + columnName + "]";
    }
}
