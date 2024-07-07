package Programming_on_Arrays;

public class SumOfFirstAndLast {

	public static int sum(int arr[])
	{
		int sum=0;
		sum=arr[0]+arr[arr.length-1];
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		System.out.println(sum(arr));
	}
	 
	
}
