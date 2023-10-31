import java.util.ArrayList;
import java.util.Scanner;
public class ProjectManagerUI {
    
    public static void main(String[] args) {

        ArrayList<User> users = DataLoader.GetUsers();
		ArrayList<Task> task =  DataLoader.GetTask();
		ProjectManagerUI ui = new ProjectManagerUI();
		
  	    for(int i= 0 ; i < users.size(); i++ ){
			System.out.println(users.get(i));
  	    }
		for(int j = 0; j < task.size(); j++) {
			System.out.println(task.get(j));
		}
		ui.run();
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        boolean running = true;
        ProjectApplication projectApp = new ProjectApplication();
        UserList user = new UserList();

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
                    user.logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            boolean isLoggedIn = true;

            while(isLoggedIn){
                System.out.println("Would you like to:\n 1. View Projects\n 2. Create Project\n 3. Open Project\n 4. Create a Task\n 5. Exit");
                int choice2 = input.nextInt();
                input.nextLine();
                switch(choice2){
                    case 1:
                        projectApp.getAllProjects();
                        break;
                    case 2:
                        projectApp.createProject();
                        break;
                    case 3:
                        projectApp.openProject();
                        {
                            boolean isOpen = true;
                            while(isOpen){
                                System.out.println("Would you like to:\n 1. View Tasks\n 2. Create Column\n 3. Create Task\n 4. Write Comment\n 5. Exit");
                                int choice3 = input.nextInt();
                                input.nextLine();
                                switch(choice3){
                                    case 1:
                                        //projectApp.getAllTasks();
                                        break;
                                    case 2:
                                        //projectApp.createColumn();
                                        break;
                                    case 3:
                                        //projectApp.createTask();
                                        break;
                                    case 4:
                                        //projectApp.writeComment();
                                        break;
                                    case 5:
                                        isOpen = false;
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                        break;
                                }
                            }
                        }
                        break;
                    case 4:
                        //projectApp.createTask();
                        break;
                    case 5:
                        running = false;
                        user.logout();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    } 
}
