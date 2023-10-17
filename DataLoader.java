import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
public class DataLoader extends DataConstants {
    public static void main(String[] args) {
        GetUsers();
        GetProjects();
      
    }
    public static ArrayList<Project> GetProjects() {
        ArrayList<Project> project = new ArrayList<Project>();
        //ArrayList<User> user = new ArrayList<User>();
		
		try {
			//FileReader reader = new FileReader(PROJECT_FILE_NAME);
			//JSONParser parser = new JSONParser();	
			//JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
			
			//for(int i=0; i < peopleJSON.size(); i++) {
				//JSONObject personJSON = (JSONObject)peopleJSON.get(i);
				UUID id = UUID.fromString((String)personJSON.get(USER_ID));
				String projectName = "Temp_projectName";//(String)personJSON.get(PROJECT_NAME);
				String projectdes = "description goes here";//(String)personJSON.get(PROJECT_DES);
				String projectAuthor = "temp_User"; //(String)personJSON.get(PROJECT_AUTHOR);
				
                // add id when it can
				project.add(new Project(projectName, projectdes, projectAuthor));
			//}
			
			return project;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
    
    public static ArrayList<User> GetUsers() {
       ArrayList<User> users = new ArrayList<User>();
		
		try {
			//FileReader reader = new FileReader(USER_FILE_NAME);
			//JSONParser parser = new JSONParser();	
			//JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
			
			//for(int i=0; i < peopleJSON.size(); i++) {
				//JSONObject personJSON = (JSONObject)peopleJSON.get(i);
				//UUID id = UUID.fromString((String)personJSON.get(USER_ID));
				String userName = "Temp_userName";//(String)personJSON.get(USER_USER_NAME);
				String firstName = "sam";//(String)personJSON.get(USER_FIRST_NAME);
				String lastName = "howards"; //(String)personJSON.get(USER_LAST_NAME);
                String password = "password";//(String)personJSON.get(USER_PASSWORD);
				int privacy = 0;//((Long)personJSON.get(USER_PRIVACY)).intValue();
				String email = "sam@email.com";//(String)personJSON.get(USER_EMAIL);
				
                // add id when it can
				users.add(new User(userName, password, firstName, lastName, email, privacy));
			//}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
}