/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: This class calls a public method to retrieve the price of books
*/
package Shopping;

public class Book extends Readable{ // 'Book' inherits all the fields and methods of the 'Readable' class

	@Override 
	public int getPrice() //method to get price
	{
		return price;
	}
}
