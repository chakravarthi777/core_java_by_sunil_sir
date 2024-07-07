package approach3_programming;

public class Balloon {
	private static String sellerName="Mahesh";
	private static String gasType="Helium";
	private  String color;
	
	public Balloon(String color) //constructor
	{
		if(color.equals("RED") || color.equals("ORANGE") || color.equals("WHITE") ||color.equals("BLACK") )
		{
			this.color=color;
		}
		else
			System.out.println("Invalid data");
	}
	public void display()
	{
		System.out.println("seller name : "+sellerName+", Balloon-color : "+color);
	}
}
