/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: A class that calls a public method for retrieving the price of a book 
*/
package Shopping;

public class Book extends Readable{ // 'Book' inherits all the fields and methods of the 'Readable' class

	@Override 
	public int getPrice() //method to get price
	{
		return price;
	}
}
