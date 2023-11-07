//@author Logan Praylow

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class DataLoaderTest {
    
    private UserList users = UserList.getInstance();
	private ArrayList<User> userList = users.getUserList();
	//user array tester
	@BeforeEach
	public void setupUser() {
		userList.clear();
		userList.add(new User("jb","1234","Josh","bailey","jb@gmail.com",1));
		userList.add(new User("msue","2468","Mary","sue","ms@gmail.com",2));
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDownUser() {
		UserList.getInstance().getUserList().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	public void testGetUsersSize() {
		userList = DataLoader.GetUsers();
		assertEquals(2, userList.size());
	}

	@Test
	public void testGetUsersSizeZero() {
		UserList.getInstance().getUserList().clear();
		DataWriter.saveUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	public void testGetUserFirstUserName() {
		userList = DataLoader.GetUsers();
        assertEquals("jb", userList.get(0).getUserName());
    }


    //project array tester
    private ProjectList projects = ProjectList.getInstance();
    private ArrayList<Project> projectList = projects.getProjectList();

    @BeforeEach
    public void setupPro() {
        projectList.clear();
        projectList.add(new Project("Project 1", "Description 1", "Author 1"));
        projectList.add(new Project("Project 2", "Description 2", "Author 2"));
        DataWriter.saveProjects();
    }

    @AfterEach
    public void tearDownPro() {
        ProjectList.getInstance().getProjectList().clear();
        DataWriter.saveProjects();
    }

    @Test
    public void testGetProjectsSize() {
        projectList = DataLoader.GetProjects();
        assertEquals(2, projectList.size());
    }

    @Test
    public void testGetProjectsSizeZero() {
        ProjectList.getInstance().getProjectList().clear();
        DataWriter.saveProjects();
        assertEquals(0, projectList.size());
    }

    @Test
    public void testGetProjectName() {
        projectList = DataLoader.GetProjects();
        assertEquals("Project 1", projectList.get(0).getProjectName());
    }
        //task array tester
        private TaskList tasks = TaskList.getInstance();
        private ArrayList<Task> taskList = tasks.geTasksList();
    
        @BeforeEach
        public void setupTask() {
            taskList.clear();
            ArrayList<Comment> task1Comments = new ArrayList<>();
             ArrayList<Comment> task2Comments = new ArrayList<>();
            task1Comments.add(new Comment("User1", "Comment 1", "2023-11-07"));
            task1Comments.add(new Comment("User2", "Comment 2", "2023-11-07"));
            taskList.add(new Task("Task 1", "Description 1", 1, Category.BUG, task1Comments, true, 1, "Red"));
            taskList.add(new Task("Task 2", "Description 2", 2, Category.BUG, task2Comments, false, 2, "Green"));
            DataWriter.saveTasks();
        }
    
        @AfterEach
        public void tearDownTask() {
            TaskList.getInstance().geTasksList().clear();
            DataWriter.saveTasks();
        }
    
        @Test
        public void testGetTasksSize() {
            taskList = DataLoader.GetTask();
            assertEquals(2, taskList.size());
        }
    
        @Test
        public void testGetTasksSizeZero() {
            TaskList.getInstance().geTasksList().clear();
            DataWriter.saveTasks();
            assertEquals(0, taskList.size());
        }
    
        @Test
        public void testGetTaskName() {
            taskList = DataLoader.GetTask();
            assertEquals("Task 1", taskList.get(0).getTaskName());
        }

}
