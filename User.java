/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: A class that calls on private methods to retrieve a user's username.
*/

package Shopping;
import java.util.Scanner;

public class User {
	private String username;//username
	//private String password;//password should we implement admin
	
	//method to get username
	public String getUsername(Scanner reader){
		username = reader.next(); //save next user input to sting called username
		return username; //get username
	}
	/*public String getPassword()
	{
		if (getUsername(reader) == "ADMIN")
		{
			Scanner reader = new Scanner(System.in);
			System.out.print("Password: ");
			password = reader.next();
			reader.close();
		}
		return password;
	}*/
}
