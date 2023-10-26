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
		ProjectManagerUI ui = new ProjectManagerUI();
		
  	    for(int i= 0 ; i < users.size(); i++ ){
			System.out.println(users.get(i));
  	    }

		ui.run();
    }


    /**
	 * grabs the projects from the json file
     * @return the project from a json file into a arrayList
     */
    public static ArrayList<Project> GetProjects() {
		ArrayList<Project> project = new ArrayList<Project>();
		
		try {
			
			FileReader reader = new FileReader(PROJECT_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray projJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < projJSON.size(); i++) {
				JSONObject projectJSON = (JSONObject)projJSON.get(i);
				UUID id = UUID.fromString((String)projectJSON.get(PROJECT_ID));
				String projectName = (String)projectJSON.get(PROJECT_NAME);
				String projectdes = (String)projectJSON.get(PROJECT_DESCRIPTION);
				String projectAuthor = (String)projectJSON.get(PROJECT_AUTHOR);
				//ArrayList<Task> tasks = ArrayList.fromString((String)projectJSON.get(PROJECT_TASK)); 
				
                // add id when it can
				project.add(new Project(id, projectName, projectdes, projectAuthor));
			}
			
			
			return project;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

    /**
	 * grabs the users from the json file
     * @return the users from a json file into a arraylist
     */
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
	public static ArrayList<Task> GetTask() {
		ArrayList<Task> tasks = new ArrayList<Task>


	}
}
