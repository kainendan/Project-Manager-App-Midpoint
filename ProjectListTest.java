import org.junit.Test;
import static org.junit.Assert.*;

// Jason Spratt
public class ProjectListTest {
    @Test
    public void testAddProject() {
        ProjectList projectList = new ProjectList();
        projectList.addProject("Test Project", "Test Description", "Test Author");
        assertEquals("Test Project", projectList.getProjectList().get(4).getProjectName());
        assertEquals("Test Author", projectList.getProjectList().get(4).getProjectAuthor());
    }


    @Test
    public void testAddTask() {
        ProjectList projectList = new ProjectList();
        projectList.addTask("Test Task", "Test Description", 1, Category.BUG, null, false, 1, "red");
        assertEquals("Test Task", projectList.geTasksList().get(0).getTaskName());
        assertEquals("Test Description", projectList.geTasksList().get(0).getTaskDes());
        assertEquals("1", projectList.geTasksList().get(0).getTaskPrio());
        assertEquals(Category.BUG, projectList.geTasksList().get(0).getCategory());
        assertEquals(null, projectList.geTasksList().get(0).getComments());
        assertEquals(false, projectList.geTasksList().get(0).getInProgress());
        assertEquals(1, projectList.geTasksList().get(0).getTaskPrivacy());
        assertEquals("red", projectList.geTasksList().get(0).getColor());
    }
}
