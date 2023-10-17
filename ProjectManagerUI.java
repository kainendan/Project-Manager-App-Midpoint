import java.util.Scanner;


   
public class ProjectManagerUI {
    private Scanner scanner;
    private ProjectApplication application;

    public ProjectManagerUI() {
        scanner = new Scanner(System.in);
    }

    public void run() {
         
    }

    public void displayMenu() {

    }
    //May need to add more classes soon
}

    public void signUp() {
        
    }
<<<<<<< HEAD
}
=======

    public void logIn() {
        UserList userList = UserList.getInstance();

        String userName = getField("Enter your username");
        String password = getField("Enter your password");

        if (userList.isValidLogin(userName, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    private String getField(String prompt) {
        System.out.println(prompt + ": ");
        return scanner.nextLine();
    }
}
>>>>>>> 650206de41b063dbe7742bc3d83b2b4cfa1a60c3
