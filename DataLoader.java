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
		ArrayList<Task> task =  GetTask();
		ProjectManagerUI ui = new ProjectManagerUI();
		
  	    for(int i= 0 ; i < users.size(); i++ ){
			System.out.println(users.get(i));
  	    }
		for(int j = 0; j < task.size(); j++) {
			System.out.println(task.get(j));
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
				String privacy = (String)personJSON.get(USER_PRIVACY);
				int privacyValue = Integer.parseInt(privacy); 
				String email = (String)personJSON.get(USER_EMAIL);
				
                // add id when it can
				users.add(new User(id, userName, password, firstName, lastName, email, privacyValue));
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }

	public static ArrayList<Task> GetTask() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		try {
					FileReader reader = new FileReader(TASK_FILE_NAME);
					JSONParser parser = new JSONParser();	
					JSONArray tkJSON = (JSONArray)new JSONParser().parse(reader);

					for(int i = 0; i < tkJSON.size(); i++) {
						JSONObject taskJSON = (JSONObject)tkJSON.get(i);
						UUID id = UUID.fromString((String)taskJSON.get(TASK_ID));
						String taskName = (String)taskJSON.get(TASK_NAME);
						String taskDes = (String)taskJSON.get(TASK_DESC);
						String taskPrio = (String)taskJSON.get(TASK_PRIO);
						//int taskPrioValue = Integer.parseInt(taskPrio);
						//System.out.println(taskPrioValue);
						String taskPrivacy = (String)taskJSON.get(TASK_PRIV);
						int taskPrivacyValue = Integer.parseInt(taskPrivacy);
						String taskCateString = (String)taskJSON.get(TASK_CATE);
						
						ArrayList<Comment> taskThread = new ArrayList<Comment>();
						for(int j = 0; j < ((String) taskJSON.get(TASK_THREAD)).length(); j++) {
							taskThread.add((Comment) taskJSON.get(j));
						}
						
						boolean inProgress = (Boolean)taskJSON.get(TASK_INPROGRESS);
						String color = (String)taskJSON.get(TASK_COLOR);
						if(taskCateString.equals(Category.BUG)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.BUG, taskThread, inProgress, taskPrivacyValue, color));
						} else if(taskCateString.equals(Category.FEATURE)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.FEATURE, taskThread, inProgress, taskPrivacyValue, color));
						} else if(taskCateString.equals(Category.URGENT_BUG)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.FEATURE, taskThread, inProgress, taskPrivacyValue, color));
						} else if(taskCateString.equals(Category.URGENT_BUG)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.URGENT_BUG, taskThread, inProgress, taskPrivacyValue, color));
						} else if(taskCateString.equals(Category.URGENT_FEATURE)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.URGENT_FEATURE, taskThread, inProgress, taskPrivacyValue, color));
						} else if(taskCateString.equals(Category.OPTIONAL_FEATURE)) {
							tasks.add(new Task(id, taskName, taskDes, 1, Category.OPTIONAL_FEATURE, taskThread, inProgress, taskPrivacyValue, color));
						} else {
							System.out.println("Unable to load task category");
						}
					}


					return tasks;

				}catch (Exception e) {
					e.printStackTrace();
				}
				return null;


	}
		
	




}



 