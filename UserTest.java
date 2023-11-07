import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

     /**
     * Test the toString method of the User class.
     * Verify that the toString method returns the expected string representation of a user object.
     */
    @Test
    public void testToString() {
        String userName = "jane_smith";
        User user = new User(userName, "password456", "Jane", "Smith", "jane.smith@example.com", 2);

        
        assertEquals("User [userId=" + user.getId() + ", username=" + userName + "]", user.toString());
    }

}
