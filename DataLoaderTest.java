//@author Logan Praylow

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
public class DataLoaderTest {
    
    private UserList users = UserList.getInstance();
	private ArrayList<User> userList = users.getUserList();
	
	@BeforeEach
	public void setup() {
		UserList.clear();
		UserList.addUser("jb","1234","Josh","bailey","jb@gmail.com",1);
		UserList.addUser("jb","1234","Josh","bailey","jb@gmail.com",1);
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		UserList.getInstance().getUserList().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testGetUsersSize() {
		userList = DataLoader.getUserList();
		assertEquals(2, userList.size());
	}

	@Test
	void testGetUsersSizeZero() {
		UserList.getInstance().getUserList().clear();
		DataWriter.saveUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	void testGetUserFirstUserName() {
		userList = DataLoader.getUserList();
		assertEquals("asmith", userList.get(0).getUserName());
	}



}
