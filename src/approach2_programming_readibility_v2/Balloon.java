package approach2_programming_readibility_v2;

public class Balloon {
	private static String sellerName="ALEX";
	private static String gasType="Helium";
	private  String color;
	
	public void initialize(String color)
	{
		if(giveColor(color))
		{
			this.color=color;
		}
		else
			System.err.println("Invalid color");
		
	}
	private boolean giveColor(String color)
	{
		if(color.equals("RED") || color.equals("ORANGE") || color.equals("WHITE") ||color.equals("BLACK") )
		{
			return true;
		}
		return false;
	}
	public void display()
	{
		System.out.println("A balloos seller "+sellerName+" sells "+color+" ballons filled with "+gasType+" gas.");
	}
}
