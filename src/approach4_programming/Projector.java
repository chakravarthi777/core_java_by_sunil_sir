//approach 3 programming
package approach4_programming;

public class Projector {
	private String brandName;
	public Projector(String brandName)
	{
		if(checkBrandName(brandName))
		{
			this.brandName=brandName;
		}
			
	}
	private boolean checkBrandName(String brandName)
	{
		if(brandName.equalsIgnoreCase("Lg")||brandName.equalsIgnoreCase("sony")||brandName.equalsIgnoreCase("samsung"))
		{
			return true;
		}
		return false;
	}
	public void display()
	{
		System.out.println("Brandname :"+brandName);
	}
	public void connect()
	{
		System.out.println("connect");
	}
	public void mirrorScreen()
	{
		System.out.println("mirrorscreen");
	}
	
}
