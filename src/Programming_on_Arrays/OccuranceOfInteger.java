package Programming_on_Arrays;
import java.util.Scanner;
public class OccuranceOfInteger 
{
	public static void occuranceOfIntegers(int a[])
	{
		int b[]= new int[a.length];
		boolean isDuplicate=false;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					isDuplicate=true;
					break;
				}	
			}
			if(isDuplicate==false)
			{
				b[count]=a[i];
				count++;
			}
			isDuplicate=false;
		}	
		for(int i=0;i<b.length;i++)
		{
			int dcount=0;
			for(int j:a)
			{
				if(b[i]==j)
				{
					dcount++;
				}
			}
			if(dcount>1)
				System.out.println(b[i]+" -----> Repeated "+dcount+" Times");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.print("Enter values : ");
		
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		
		occuranceOfIntegers(a);
	}

}
