package ruf;

public class OddNumbersOfRange {

	public static void odd(int n,int m)
	{
		for(int i=n;i<=m;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		odd(1,10);
	}
}
