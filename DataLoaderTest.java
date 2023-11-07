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
<<<<<<< HEAD
		userList.clear();
=======
		UserList.getInstance().getUserList().clear();
>>>>>>> fa2db3f8238a5779fe80e13e38497c37e59a70be
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
<<<<<<< HEAD

    }
=======
	
>>>>>>> fa2db3f8238a5779fe80e13e38497c37e59a70be



}
