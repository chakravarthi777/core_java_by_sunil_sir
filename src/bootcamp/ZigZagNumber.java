package bootcamp;

import java.util.Scanner;

public class ZigZagNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int t1=n;
		int t2=m;
		
		int dcount1=0;
		int dcount2=0;
		int rev=0;
		while(t1>0)
		{
			int d=t1%10;
			rev=rev*10+d;
			t1/=10;
			dcount1++;
		}
		while(t2>0)
		{
			int d=t2%10;
			dcount2++;
			t2/=10;
		}
		long result=0;
		if(dcount1==dcount2)
		{
			while(rev>0)
			{
				long d1=rev%10;
				result=result*10+d1;
				rev/=10;
				long d2=m%10;
				result=result*10+d2;
				m/=10;
			}
			System.out.println(result);
		}
		else
			System.out.println("Invalid");	
	}

}
