/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: A class that calls on several public methods to create a unique shopping caret for each user and populate it with all items
		user selects for purchase, and empties it upon purchase or logout.
*/

package Shopping;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ShoppingCart extends User{
	private String content = "";
	String[] prodNames = new String[100]; //declare arrays to store all product names in cart
	int[] quantities = new int[100]; //declare arrays to store all product quantities in cart
	
	public String getContent()
	{
		return content; //get contents of content
	}
	
	//Add selected items to user's cart
	public void addItem(String username, int sNo, String prodName, int quantity)
	{	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //Set date format
	Date date = new Date(); //Get current date with Date()
	
		try {
			File file = new File("Cart_" + username + ".txt"); 
			//Check to see if cart file for user already exists
			if(!file.exists()){
				file.createNewFile(); //if no cart exists for user, create one
			}
			
			//Write product info to cart file for user
			FileWriter fileWriter = new FileWriter("Cart_" + username + ".txt", true); //sets new file (user's cart) to write to
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write("\n" + sNo + ", " + prodName + ", " + dateFormat.format(date) + ", " + quantity ); //Populate cart
			bw.close(); //close file
			
		}catch (IOException e){
			e.printStackTrace(); //catches exceptions
		}
		
		//Add product name and quantity to prodNames and quantities arrays, respectively
		int i = 0;
		while(i<100)
		{
			if(prodNames[i] == null && quantities[i] == 0)//make sure array elements are blank
			{
			prodNames[i] = prodName; //write to blank elements
			quantities[i] = quantity;
			break; //break once prodName and quantity are recorded (only want one record)
			}else
			{
				i++; //if array elements are not blank, repeat for next element
			}
		}		
	}
	
	//Add product info to content
	public void addContent(String username, int sNo, String prodName, int quantity)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //Set date format
		Date date = new Date(); //Get current date with Date()
		
		content = content + sNo + ", " + prodName + ", " + dateFormat.format(date) + ", " + quantity + "\n"; //add new line of cart info to content
	}
	
	//clear cart_username.txt file
	public void clearCart(String username)
	{
		try	{
			PrintWriter pw = new PrintWriter("Cart_" + username + ".txt"); //sets new file to clear
			pw.close(); //close file
		}catch (IOException e){
			e.printStackTrace(); //catch exceptions
		}
	}	
	
	public String getName(int i)
	{
		return prodNames[i]; //get array element (name of product)
	}
	
	public int getQuantity(int i)
	{
		return quantities[i]; //get arrary element (quantity of product)
	}
}
