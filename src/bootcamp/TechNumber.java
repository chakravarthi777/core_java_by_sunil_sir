package bootcamp;

public class TechNumber {
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
			return count;
	}
	
	public static int seperate(int n)
	{
		int sum=0;
		if(count(n)%2==0)
		{
			int j=10;
			for(int i=1;i<count(n)/2;i++)
			{
				j=j*10;
			}
			int lastDigits=n%j;
			int firstDigits=n/j;
			sum=firstDigits+lastDigits;
		}
		return sum;
	}
	public static void techNumber(int n)
	{
		System.out.println(((seperate(n)*seperate(n))==n)?true:false);
	}
	
	public static void main(String[] args) {
		int n=3025;
		techNumber(n);
	}

}
