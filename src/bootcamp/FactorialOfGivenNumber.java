package bootcamp;

public class FactorialOfGivenNumber 
{
	public static int fact(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}
		return product;
	}
	public static boolean isPeterSon(int n)
	{
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int d=temp%10;
			sum+=fact(d);
			temp/=10;
		}
		if(n==sum)
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		int n=40585;
		System.out.println(isPeterSon(n));
	}

}
