package Shopping;

public class eBook extends Readable { //The 'eBook' class inherits all the fields and methods of the 'Readadle' class
	@Override //Used to override the getPrice() method
	public int getPrice() //method to get price
	{
		return price;
	}
}
