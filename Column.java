import java.util.ArrayList;

/*
 * This class is used to create a column object, which is a list of task objects.
 */
public class Column {
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
    public void addTask(String taskName, String taskDesc, String taskAuthor) {
        tasks.add(new Task(taskName, taskDesc, taskAuthor));
    }

    /**
     * Remove a task from the column
     * @param taskName
     */
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
