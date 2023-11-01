//@author RJ Allen
import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    
    /**
     * Load projects from the JSON file.
     * @return An ArrayList of Project objects.
     */
    public static ArrayList<Project> GetProjects() {
        ArrayList<Project> projects = new ArrayList<Project>();
        
        try {
            FileReader reader = new FileReader(PROJECT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray projJSONArray = (JSONArray) parser.parse(reader);
            
            for (Object projObj : projJSONArray) {
                JSONObject projectJSON = (JSONObject) projObj;
                UUID id = UUID.fromString((String) projectJSON.get(PROJECT_ID));
                String projectName = (String) projectJSON.get(PROJECT_NAME);
                String projectDesc = (String) projectJSON.get(PROJECT_DESCRIPTION);
                String projectAuthor = (String) projectJSON.get(PROJECT_AUTHOR);

                projects.add(new Project(id, projectName, projectDesc, projectAuthor));
            }

            return projects;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    /**
     * Load users from the JSON file.
     * @return An ArrayList of User objects.
     */
    public static ArrayList<User> GetUsers() {
        ArrayList<User> users = new ArrayList<User>();
        
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSONArray = (JSONArray) parser.parse(reader);
            
            for (Object userObj : userJSONArray) {
                JSONObject userJSON = (JSONObject) userObj;
                UUID id = UUID.fromString((String) userJSON.get(USER_ID));
                String userName = (String) userJSON.get(USER_USER_NAME);
                String firstName = (String) userJSON.get(USER_FIRST_NAME);
                String lastName = (String) userJSON.get(USER_LAST_NAME);
                String password = (String) userJSON.get(USER_PASSWORD);
                String email = (String) userJSON.get(USER_EMAIL);
                int privacyValue = Integer.parseInt((String) userJSON.get(USER_PRIVACY));

                users.add(new User(id, userName, password, firstName, lastName, email, privacyValue));
            }

            return users;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    /**
     * Load tasks from the JSON file.
     * @return An ArrayList of Task objects.
     */

	 public static User getUserByUsername(String username) {
        UserList userList = UserList.getInstance(); // Replace with your actual method to get the user list
        return userList.getUserByUsername(username);
    }

    public static ArrayList<Task> GetTask() {
        ArrayList<Task> tasks = new ArrayList<Task>();
        
        try {
            FileReader reader = new FileReader(TASK_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray taskJSONArray = (JSONArray) parser.parse(reader);
            
            for (Object taskObj : taskJSONArray) {
                JSONObject taskJSON = (JSONObject) taskObj;
                UUID id = UUID.fromString((String) taskJSON.get(TASK_ID));
                String taskName = (String) taskJSON.get(TASK_NAME);
                String taskDesc = (String) taskJSON.get(TASK_DESC);
                int taskPrioValue = Integer.parseInt((String) taskJSON.get(TASK_PRIO));
                Category taskCategory = Category.valueOf((String) taskJSON.get(TASK_CATE));

                JSONArray taskThreadJSONArray = (JSONArray) taskJSON.get(TASK_THREAD);
                ArrayList<Comment> taskThread = new ArrayList<Comment>();
                
                for (Object commentObj : taskThreadJSONArray) {
                    JSONObject commentJSON = (JSONObject) commentObj;
                    String comAuth = (String) commentJSON.get("ComAuth");
                    String comText = (String) commentJSON.get("Comment");
                    String comDate = (String) commentJSON.get("ComDate");
                    //User commentAuthor = getUserByUsername(comAuth); 
                   // Comment comment = new Comment(commentAuthor, comText, comDate);
                    //taskThread.add(comment);
                }

                boolean inProgressBoo = Boolean.parseBoolean((String) taskJSON.get(TASK_INPROGRESS));
                int taskPrivacyValue = Integer.parseInt((String) taskJSON.get(TASK_PRIV));
                String color = (String) taskJSON.get(TASK_COLOR);

                tasks.add(new Task(id, taskName, taskDesc, taskPrioValue, taskCategory, taskThread, inProgressBoo, taskPrivacyValue, color));
            }
            
            return tasks;

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}



 