package Programming_on_Arrays;

public class DuplicateElementsAndZeroElements {
	public static int isZero(int arr[])
	{
		int zero=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==0)
			{
				zero=0;
				break;
			}
		}
		return zero;
	}
	public static void duplicates(int arr[])
	{
		boolean isFound=false;
		int k=0;
		int duplicates[]=new int[arr.length-1];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+",");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("No Duplicate values ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,5,3};
		if(isZero(arr)==0)
		{
			System.out.println("Array has zero elements");
		}
		duplicates(arr);
	}

}
