//Tested by RJ Allen
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DataWriterTest {
	private UserList users = UserList.getInstance();
    private ProjectList project = ProjectList.getInstance();
    //Task List will be remove and and moved to projectList in the future 
    // This will mostly be used for testing purposes
    private TaskList task = TaskList.getInstance();
	private ArrayList<User> userList = users.getUserList();
    private ArrayList<Project> projectList = project.getProjectList();
    private ArrayList<Task> taskList = task.geTasksList();
    private ArrayList<Comment> comment = new ArrayList<Comment>();
	
	@BeforeEach
	public void setup() {
		UserList.getInstance().getUserList().clear();
        TaskList.getInstance().geTasksList().clear();
        ProjectList.getInstance().getProjectList().clear();
		DataWriter.saveUsers();
        DataWriter.saveProjects();
        DataWriter.saveTasks();
	}
	
	@AfterEach
	public void tearDown() {
		UserList.getInstance().getUserList().clear();
        TaskList.getInstance().geTasksList().clear();
        ProjectList.getInstance().getProjectList().clear();
		DataWriter.saveUsers();
        DataWriter.saveProjects();
        DataWriter.saveTasks();
	}
	
	
	@Test
	void testWritingZeroUsers() {
		userList = DataLoader.GetUsers();
        projectList = DataLoader.GetProjects();
        taskList = DataLoader.GetTask();

		assertEquals(0, userList.size());
	}

	@Test
	void testWritingOneUser() {
		userList.add(new User("asmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		DataWriter.saveUsers();
		assertEquals("asmith", DataLoader.GetUsers().get(0).getUserName());
	}

    @Test
    void testWritingOneProject() {

    }
	
    @Test
    void WritingOneTask() {

        comment.add(new Comment("N/A", "N/A", "N/A"));

    }

	@Test
	void testWritingFiveUsers() {
		userList.add(new User("bsmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		userList.add(new User("csmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		userList.add(new User("dsmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		userList.add(new User("esmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		userList.add(new User("fsmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		DataWriter.saveUsers();
		assertEquals("esmith", DataLoader.GetUsers().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyUser() {
		userList.add(new User("", "", "","", "", 0));
		DataWriter.saveUsers();
		assertEquals("", DataLoader.GetUsers().get(0).getUserName());
	}
	
	@Test
	void testWritingNullUser() {
		userList.add(new User(null, "", "", "", "", 0));
		DataWriter.saveUsers();
		assertEquals(null, DataLoader.GetUsers().get(0).getUserName());
	}


    
}
