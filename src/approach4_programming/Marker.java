package approach4_programming;

public class Marker {
	private String brandName;
	private int height;
	private String[] bn={"renolds","cello","parker"};
	
	public Marker(String brandName,int height)
	{
		if(checkBrandName(brandName)==1 && checkHeight(height))
		{
			this.brandName=brandName;
			this.height=height;
		}
	}
	public void markerDetails()
	{
		System.out.println("BrandName    :"+brandName);
		System.out.println("hieght in cm :"+height);
		convertCmToM(height);
	}
	private int checkBrandName(String brandName)
	{
		int flag=0;
		for(int i=0;i<=bn.length-1;i++)
		{
			if(bn[i].equals(brandName))
			{
				flag=1;
				break;
			}
		}
		return flag;
	}
	private boolean checkHeight(int height)
	{
		if(height >=15 && height<=20)
			return true;
		
		return false;
	}
	//other methods
	public void convertCmToM(int height)
	{
		double heightInM=(height/100.0);
		System.out.println(heightInM);
	}
}
