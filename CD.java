/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: This class calls a public method to retrieve the price of CDs  
*/
package Shopping;
public class CD extends Audio{ // CD class inherits all the fields and methods of the Audio class
	@Override  //Used to override a method
	public int getPrice() //method to get the price
	{
		return price;
	}
}
