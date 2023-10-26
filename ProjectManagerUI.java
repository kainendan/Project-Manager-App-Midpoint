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
                    break;
                case 2:
                    projectApp.signUp();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    

    
}
