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
        Task task = new Task("Test Task", "Test Description", 0, null, null, false, 0, "Test Author");
        column.addTask(task);
        assertEquals("Test Task", task.getTaskName());
    }

    @Test
    public void testRemoveTask() {
        Column column = new Column("Backlog");
        Task task = new Task("Test Task", "Test Description", 0, null, null, false, 0, "Test Author");
        column.addTask(task);
        column.removeTask(task);
        assertEquals(0, column.getTasks().size());
    }
}
