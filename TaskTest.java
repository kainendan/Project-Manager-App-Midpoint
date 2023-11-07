//Tested by RJ Allen
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TaskTest {
    private TaskList tasks = TaskList.getInstance();
    private ArrayList<Comment> comment = new ArrayList<>();

    @BeforeEach
    public void setup() {
        tasks.getInstance().geTasksList().clear();
        DataWriter.saveTasks();
    }
    
    @AfterEach
    public void tearDown() {
        tasks.getInstance().geTasksList().clear();
        DataWriter.saveTasks();
    }

    @Test
    public void testAddValidTask() {
        int initialSize = tasks.geTasksList().size();
        tasks.addTask("Task", "taskDesc", 0, Category.BUG, comment, false, 0, null);
        assertEquals(initialSize + 1, tasks.geTasksList().size());
    }
}
