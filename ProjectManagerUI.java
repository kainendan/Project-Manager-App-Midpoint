import java.util.Scanner;
public class ProjectManagerUI {

    public void run(){
        Scanner input = new Scanner(System.in);
        boolean running = true;
        ProjectApplication projectApp = new ProjectApplication();

        while(running){
            System.out.println("Welcome to Project Manager!");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    projectApp.logIn();
                case 2:
                    projectApp.signUp();
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("Would you like to:\n 1. View Projects\n 2. Create Project\n 3. Create a Task\n 4. Exit");
            int choice2 = input.nextInt();
            input.nextLine();
            switch(choice2){
                case 1:
                    projectApp.getAllProjects();
                case 2:
                    projectApp.createProject();
                case 3:
                    projectApp.createTask();
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }

    

    
}
