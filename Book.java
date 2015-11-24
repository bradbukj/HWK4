package Shopping;

public class Book extends Readable{ // 'Book' inherits all the fields and methods of the 'Readable' class

	@Override 
	public int getPrice() //method to get price
	{
		return price;
	}
}
