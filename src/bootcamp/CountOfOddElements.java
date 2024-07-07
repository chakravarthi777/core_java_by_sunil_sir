package bootcamp;

import java.util.Scanner;

public class CountOfOddElements {

	public static int count(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(count(a));

	}

}
