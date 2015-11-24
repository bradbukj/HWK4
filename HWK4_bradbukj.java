/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: A class that calls on a public method to initialize all classes, class variables, and start the first user menu.
*/

package Shopping;
public class HWK4_wuzz {
	public static void main(String[] args) 
	{
		UserInterface UI = new UserInterface();//initialize class
		UI.Initializer();//initialize class variables
		UI.logIn();//start on first menu
	}
}
