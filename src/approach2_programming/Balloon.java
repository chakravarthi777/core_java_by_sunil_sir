package approach2_programming;

public class Balloon {
	private static String sellerName="Alex";
	private static String gasType="Helium";
	private  String color;
	
	public void giveColor(String a)
	{
		if(a.equals("RED") || a.equals("ORANGE") || a.equals("WHITE") ||a.equals("BLACK") )
		{
			color=a;
		}
		else
			System.out.println("Invalid data");
	}
	public void display()
	{
		System.out.println("seller name : "+sellerName+",Balloon-color : "+color);
	}
}
