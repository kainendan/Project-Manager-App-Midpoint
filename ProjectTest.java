import org.junit.Test;
import static org.junit.Assert.*;
//import org.junit.Test;
//import org.junit.BeforeEach;
//import org.junit.AfterEach;


// Jason Spratt
public class ProjectTest {
    /*@Test
    public void testing() {
        assertTrue(true);
    }*/

    //tests adding columns to a project
    @Test
    public void testAddColumn() {
        Project project = new Project("Test Project", "Test Description", "Test Author");
        Column column = new Column("Test Column");
        project.addColumn(column);
        assertEquals("Test Column", column.getColumnName());
    }
    

    //tests adding comments to a project
    @Test
    public void testAddComment() {
        Project project = new Project("Test Project", "Test Description", "Test Author");
        Comment comment = new Comment("Test Author", "Test Comment", "Test Date");
        project.addComment(comment);
        assertEquals("Test Author", comment.getAuthor());
        assertEquals("Test Comment", comment.getText());
        assertEquals("Test Date", comment.GetDate());
    }

    //tests printing the board
    @Test
    public void testPrintBoard() {
        Project project = new Project("Test Project", "Test Description", "Test Author");
        Column column = new Column("Test Column");
        project.addColumn(column);
        Task task = new Task("Test Task", "Test Description", 0, null, null, false, 0, "Test Author");
        column.addTask(task);
        project.printBoard();
        assertEquals("Test Column", column.getColumnName());
        assertEquals("Test Task", task.getTaskName());
    }
}