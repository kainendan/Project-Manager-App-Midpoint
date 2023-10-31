
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

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

	public static JSONObject getTaskJSON(Task task) {
		JSONObject taskDetails = new JSONObject();
		taskDetails.put("taskId", task.getId().toString());
		taskDetails.put("taskName", task.getTaskName());
		// Add other task properties here
	
		return taskDetails;
	}

	public static void addTask(Task task) {
		ArrayList<Task> tasks = DataLoader.GetTask(); // Load existing tasks
		tasks.add(task); // Add the new task
		saveTasks(tasks); // Save the updated list of tasks to the JSON file
	}

	public static void removeTask(UUID taskId) {
    ArrayList<Task> tasks = DataLoader.GetTask(); // Load existing tasks
    tasks.removeIf(task -> task.getId().equals(taskId)); // Remove the task with the specified taskId
    saveTasks(tasks); // Save the updated list of tasks to the JSON file
}

	public static void saveTasks(ArrayList<Task> tasks) {
		JSONArray jsonTasks = new JSONArray();
		for (Task task : tasks) {
			jsonTasks.add(getTaskJSON(task));
		}
		
		try (FileWriter file = new FileWriter(TASK_FILE_NAME)) {
			file.write(jsonTasks.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

