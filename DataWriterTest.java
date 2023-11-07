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
	private ArrayList<User> userList = users.getUserList();
	
	@BeforeEach
	public void setup() {
		UserList.getInstance().getUserList().clear();
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		users.getInstance().getUserList().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testWritingZeroUsers() {
		userList = DataLoader.GetUsers();
		assertEquals(0, userList.size());
	}

	@Test
	void testWritingOneUser() {
		userList.add(new User("asmith","asdf", "Amy", "Smith",  "asdf@email.com", 1));
		DataWriter.saveUsers();
		assertEquals("asmith", DataLoader.GetUsers().get(0).getUserName());
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
