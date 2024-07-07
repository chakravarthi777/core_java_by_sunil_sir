package ruf;

public class Ruf {
	public static boolean isPrime(int n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
			return true;
		
		return false;
	}
	public static void main(String[] args) 
	{
		int m=50;
		int n=10;
		int c1=0;
		for(int i=m;i<=n;i++)
		{
			if(isPrime(m))
			{
				c1++;
			}
			m++;
		}
		System.out.println(c1);	
	}

}
