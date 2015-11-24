/*
* Names:     	   Kristina Bradbury	Emilio Hajj	Jim Wu
* MacIDs: 	   bradbukj	 	hajje		wuzz
* Student Numbers: 1405897		1402245		Please see submission comment
* Description: This class calls a public method to retrieve the price of MP3 audios
*/
package Shopping;
public class MP3 extends Audio{  //MP3 inherits all the fields and methods from Audio class
	@Override
	public int getPrice()  //method to get the price
	{
		return price;
	}
}
