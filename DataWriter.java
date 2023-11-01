
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

	public static void saveTasks() {
		/*ArrayList<Task> taskList = users.getTaskList();
		JSONArray jsonTask = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< taskList.size(); i++) {
			jsonTask.add(getTaskJSON(taskList.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(TASK_FILE_NAME)) {
 
            file.write(jsonTask.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }*/
	}

	public static JSONObject getTaskJSON(Task task) {
		JSONArray jsonComment = new JSONArray();
		JSONObject taskDetails = new JSONObject();
		taskDetails.put(TASK_ID, task.getId().toString());
		taskDetails.put(TASK_NAME, task.getTaskName());
		taskDetails.put(TASK_DESC, task.getTaskDes());
		taskDetails.put(TASK_PRIO, task.getTaskPrio());
		taskDetails.put(TASK_CATE, task.getCategory());
		taskDetails.put(TASK_THREAD, task.getComments());

		taskDetails.put(TASK_INPROGRESS, task.getInProgress());
		taskDetails.put(TASK_COLOR, task.getColor());
		/*ArrayList<Comment> comment= new ArrayList<Comment>();
		for(int i=0; i< comment.size(); i++) {
			jsonComment.add(getCommentJSON);
		}*/

		return taskDetails;
	}

	/*public JSONObject getCommentJSON(Comment comment) {
		JSONObject CommentDetail = new JSONObject();
		CommentDetail.put(COMMENT_AUTH, comment.getAuthor());
		CommentDetail.put(COMMENT, comment.getText());
		CommentDetail.put(COMMENT_DATE, comment.GetDate());
		return CommentDetail;
	}*/
	
	

}

