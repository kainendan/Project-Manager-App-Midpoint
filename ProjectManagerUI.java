import java.util.Scanner;


   
public class ProjectManagerUI {
    private Scanner scanner;
    private ProjectApplication application;

    public ProjectManagerUI() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        UserList user = UserList.getInstance();

        System.out.println("Welcome to MidPoints Project Manager!");
        while(true) {
            displayMenu();
        }
        
    }

    public void displayMenu() {


    }
        //May need to add more classes soon
    public void login() {

    }

    public void signUp() {
        
    }
}