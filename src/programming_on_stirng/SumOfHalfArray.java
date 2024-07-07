package programming_on_stirng;
/* sum of half array of size 6 if first half of zero not contains zero.if zero contains 
 in first half of array then print the Statement array contains zero elements.
*/
import java.util.Scanner;
public class SumOfHalfArray {

	public static int sumOfHalfArray(int a[])
	{
		int sum=0;
		for(int i=0;i<=a.length/2 -1;i++)
		{
			if(a[i]!=0)
			{
				sum+=a[i];
			}
			else 
				return 0;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a= new int[6];
		for(int i=0;i<6;i++)
		{
				a[i]=sc.nextInt();
		}
		
		if(sumOfHalfArray(a)>0)
		{
			System.out.println(sumOfHalfArray(a));
		}
		else
		{
			System.out.println("array contains zero elements");
		}
	}

}
