import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
//Written by Ben Hendrix


public class ColumnTest {
    
    @Test
    public void testColumn() {
        Column column = new Column("Backlog");
        assertEquals("Backlog", column.getColumnName());
    }

    @Test
    public void testAddTask() {
        Column column = new Column("Backlog");
        column.addTask("Task 1", "Task 1 Description", "User 1");
        assertEquals("Task 1", column.getTasks().get(0).getTaskName());
    }

    @Test
    public void testGetTasks() {
        Column column = new Column("Backlog");
        column.addTask("Task 1", "Task 1 Description", "User 1");
        column.addTask("Task 2", "Task 2 Description", "User 2");
        assertEquals("Task 1", column.getTasks().get(0).getTaskName());
        assertEquals("Task 2", column.getTasks().get(1).getTaskName());
    }

    @Test
    public void testGetColumnName() {
        Column column = new Column("Backlog");
        assertEquals("Backlog", column.getColumnName());
    }

    @Test
    public void testRemoveTask() {
        Column column = new Column("Backlog");
        column.addTask("Task 1", "Task 1 Description", "User 1");
        column.addTask("Task 2", "Task 2 Description", "User 2");
        column.removeTask("Task 1");
        assertEquals("Task 2", column.getTasks().get(0).getTaskName());
    }
}
