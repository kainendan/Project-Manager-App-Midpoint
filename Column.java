import java.lang.reflect.Array;
import java.util.ArrayList;

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

    public void addTask(Task task, String list) {
        if(list.equalsIgnoreCase("backlogList"))
        {
            backlogList().add(task);
        } else if(list.equalsIgnoreCase("todoList"))
        {
            todoList().add(task);
        } else if(list.equalsIgnoreCase("inProgressList"))
        {
            inProgressList().add(task);
        } else if(list.equalsIgnoreCase("completedList"))
        {
            completedList().add(task);
        } else {
            System.out.println("Invalid list name");
        }
    }  
}
