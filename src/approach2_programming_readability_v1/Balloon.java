package approach2_programming_readability_v1;

public class Balloon {
	private static String sellerName="DATTU";
	private static String gasType="Helium";
	private  String color;
	
	public void giveColor(String color)
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
		System.out.println("A balloos seller "+sellerName+" sells "+color+" ballons filled with "+gasType+" gas.");
	}
}
