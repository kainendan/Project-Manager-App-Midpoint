//@author RJ Allen
import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    public static void main(String[] args) {
        ArrayList<User> users = GetUsers();
  	    for(int i= 0 ; i < users.size(); i++ ){
			System.out.println(users.get(i));
  	    }
	    System.out.println("Welcome to the project manager!");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please enter your username:");
	    String userName = scanner.nextLine();
	    System.out.println("Please enter your password:");
	    String password = scanner.nextLine();
	    // search through arraylist for a matching username and password
	    if (users.contains(userName) && users.contains(password)) {
	    	System.out.println("Login successful!");
	    }
    }

    public static ArrayList<Project> GetProjects() {
		ArrayList<Project> project = new ArrayList<Project>();
		
		try {
			
			FileReader reader = new FileReader(PROJECT_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray projJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < projJSON.size(); i++) {
				JSONObject projectJSON = (JSONObject)projJSON.get(i);
				//UUID id = UUID.fromString((String)projectJSON.get(USER_ID));
				String projectName = (String)projectJSON.get(PROJECT_NAME);
				String projectdes = (String)projectJSON.get(PROJECT_DESCRIPTION);
				String projectAuthor = (String)projectJSON.get(PROJECT_AUTHOR);
				
                // add id when it can
				project.add(new Project(projectName, projectdes, projectAuthor));
			}
			
			
			return project;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
    
    public static ArrayList<User> GetUsers() {
       ArrayList<User> users = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < peopleJSON.size(); i++) {
				JSONObject personJSON = (JSONObject)peopleJSON.get(i);
				UUID id = UUID.fromString((String)personJSON.get(USER_ID));
				String userName = (String)personJSON.get(USER_USER_NAME);
				String firstName = (String)personJSON.get(USER_FIRST_NAME);
				String lastName = (String)personJSON.get(USER_LAST_NAME);
                String password = (String)personJSON.get(USER_PASSWORD);
				//int privacy = ((Long)personJSON.get(USER_PRIVACY)).intValue();
				String email = (String)personJSON.get(USER_EMAIL);
				
                // add id when it can
				users.add(new User(id, userName, password, firstName, lastName, email, 1));
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
}
