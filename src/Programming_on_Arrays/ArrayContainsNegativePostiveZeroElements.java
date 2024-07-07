package Programming_on_Arrays;

public class ArrayContainsNegativePostiveZeroElements 
{
	public static boolean isZero(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==0)
				return true;
		}
		return false;
	}
	public static boolean isNegative(int arr[])
	{
		boolean negative=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				negative =true;
				break;
			}
		}
		return negative;
	}
	public static int isPositive(int arr[])
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				sum+=arr[i];
			}
				
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		int a=-1;
		int b=0;
		if(isNegative(arr))
		{
			System.out.println(a);
		}
		else if(isZero(arr))
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(isPositive(arr));
		}
	}
}
