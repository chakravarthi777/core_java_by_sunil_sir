package Programming_on_Arrays;

import java.util.Arrays;

public class NegativeZeroPositiveElementsInArray {
	public static boolean isZero(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				return true;
		}
		return false;
	}
	public static int isNegative(int a[])
	{
		int sum=0;
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				status=true;
				break;
			}
		}
		if(status)
		{
			sum=a[0]+a[a.length-1];
		}
		return sum;	
	}
	public static boolean sort(int a[])
	{
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				status=true;
			else
			{
				status=false;
				break;
			}
		}
		
		if(status)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j]&&a[i]%2==0 && a[j]%2==0)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		
		
		System.out.println(Arrays.toString(a));
		return status;
	}
	public static void main(String[] args) {
		
		int a[]={1,8,10,4,3,6};
		
		if(isZero(a))
		{
			System.out.println("Array contains zero elements");
		}
		else if(sort(a))
		{}
		else
			System.out.println(isNegative(a));
			
	}

}
