import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
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
                        break;
                    case 4:
                    // Collect task details from the user
                     System.out.print("Enter task name: ");
                    String taskName = input.nextLine();
                    System.out.print("Enter task description: ");
                     String taskDesc = input.nextLine();
                     // Collect other task details like priority, category, etc.
                     Category taskCategory = Category.BUG; // Assuming Category is an enum
                     ArrayList<Comment> taskThread = new ArrayList<Comment>();
                     
                     // Create a new Task object with the collected details
                     Task newTask = new Task(UUID.randomUUID(),taskName, taskDesc, 3 ,taskCategory, taskThread, true, 1, "#FF0000");

                     // Add the new task to the JSON file
                     DataWriter.addTask(newTask);
                    
                    
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
