package Programming_on_Arrays;

import java.util.Iterator;

public class PrimeElementsOrPrimeNumbers {
	public static boolean isPrime(int a)
	{
		int i=1;
		for(i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(a==i)
		{
			return true;
		}
		return false;
	}
	public static void isPrimeElement(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.print(arr[i]+",");
			}
		}
	}
	public static void isPrimeNumber(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+",");
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		System.out.println("Indexes");
		isPrimeNumber(arr);
		System.out.println();
		System.out.println("Elements");
		isPrimeElement(arr);
		
	}

}
