
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	public static void saveUsers() {
		UserList users = UserList.getInstance();
		ArrayList<User> userList = users.getUserList();
		JSONArray jsonUsers = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< userList.size(); i++) {
			jsonUsers.add(getUserJSON(userList.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(jsonUsers.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getUserJSON(User user) {
		JSONObject userDetails = new JSONObject();
		userDetails.put(USER_ID, user.getId().toString());
		userDetails.put(USER_USER_NAME, user.getUserName());
		userDetails.put(USER_FIRST_NAME, user.getFirstName());
		userDetails.put(USER_LAST_NAME, user.getLastName());
		userDetails.put(USER_PASSWORD, user.getPassword());
		userDetails.put(USER_EMAIL, user.getEmail());
        
        return userDetails;
	}

	public static void saveProjects() {
		ProjectList projects = ProjectList.getInstance();
		ArrayList<Project> projectList = projects.getProjectList();
		JSONArray jsonProjects = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< projectList.size(); i++) {
			jsonProjects.add(getProjectJSON(projectList.get(i)));
		}
		
		//Write JSON file
		try (FileWriter file = new FileWriter(PROJECT_FILE_NAME)) {
 
			file.write(jsonProjects.toJSONString());
			file.flush();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getProjectJSON(Project project) {
		JSONObject projectDetails = new JSONObject();
		projectDetails.put(PROJECT_ID, project.getId().toString());
		projectDetails.put(PROJECT_NAME, project.getProjectName());
		projectDetails.put(PROJECT_DESCRIPTION, project.getProjectDesc());
		projectDetails.put(PROJECT_AUTHOR, project.getProjectAuthor());
		//projectDetails.put(PROJECT_TASK, project.getTasks());
		
		return projectDetails;
	}
	

}

