//Tested by Nick Arboscello
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserListTest {

    private UserList userList;
    /**
     * Set up the UserList instance before each test.
     */
    @Before
    public void setUp() {
     
        userList = UserList.getInstance();
    }
    /**
     * Test the addition of a new user to the user list.
     * Verifies that a user is correctly added, increasing the user count.
     */
    @Test
    public void testAddUser() {
        int initialSize = userList.getUserList().size();

        UserList.addUser("testuser", "testpassword", "Test", "User", "test@example.com", 1);

       
        assertEquals(initialSize + 1, userList.getUserList().size());
    }
    /**
     * Test the validation of user login credentials.
     * Checks if the login is valid for an existing user and rejects an invalid login.
     */
    @Test
    public void testIsValidLogin() {
      
        UserList.addUser("testuser", "testpassword", "Test", "User", "test@example.com", 1);

        assertTrue(UserList.isValidLogin("testuser", "testpassword"));

        assertFalse(UserList.isValidLogin("testuser", "wrongpassword"));
    }
    /**
     * Test the retrieval of a user by their username.
     * Verifies that the user with the specified username is correctly retrieved.
     */
    @Test
    public void testGetUser() {
        UserList.addUser("testuser", "testpassword", "Test", "User", "test@example.com", 1);

        User testUser = UserList.getUser("testuser");

        assertNotNull(testUser);
        assertEquals("testuser", testUser.getUserName());
    }

}
