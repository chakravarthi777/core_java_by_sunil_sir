package bootcamp;

public class BuzzNumber {
	public static boolean buzz(int n)
	{
		boolean buzzEndWith7=false;
		if(n%7==0 || n%10==7)
		{
			buzzEndWith7=true;
		}
		return buzzEndWith7;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=898;
		if(buzz(n))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	
		//single line answer System.out.println(((n%10==7)||(n%7==0))?true:false);	
	}
	

}
