package Programming_on_Arrays;

public class ZeroAndEvenElements 
{
	public static void evenAndZero(int arr[])
	{
		int zero=0;

			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]==0)
				{
					zero=1;
				}
				else if(arr[i]%2==0)
				{
					System.out.println(arr[i]);
				}	
			}
			if(zero==1)
			{
				System.out.println("array contains zero elements");
			}
			
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		evenAndZero(arr);
	}

}
