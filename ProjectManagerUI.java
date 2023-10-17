import java.util.Scanner;
public class ProjectManagerUI {

    private Scanner scanner = new Scanner(System.in);

    public void signUp() {
         UserList userList = UserList.getInstance();

            String userName = getField("Enter your username");
            String password = getField("Enter your password");
            String firstName = getField("Enter your first name");
            String lastName = getField("Enter your last name");
            String email = getField("Enter your email");
            int privacyLevel = Integer.parseInt(getField("Enter your privacy level"));

            UserList.addUser(userName, password, firstName, lastName, email, privacyLevel);
    }

    private String getField(String prompt) {
        System.out.println(prompt + ": ");
        return scanner.nextLine();
    }

    public void logIn() {

    }
}
