/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: A class that calls on a public method for retrieving the price of an ebook.
*/

package Shopping;

public class eBook extends Readable { //The 'eBook' class inherits all the fields and methods of the 'Readadle' class
	@Override 
	public int getPrice() //method to get price
	{
		return price;
	}
}
