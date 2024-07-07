package Programming_on_Arrays;

import java.util.Arrays;

public class SortedArray {

	public static void sortArrayAscending(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int a[]= {8,1,3,2};
		sortArrayAscending(a);
	}

}
