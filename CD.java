package Shopping;
public class CD extends Audio{ // CD class inherits all the fields and methods of the Audio class
	@Override  //Used to override a method
	public int getPrice() //method to get the price
	{
		return price;
	}
}
