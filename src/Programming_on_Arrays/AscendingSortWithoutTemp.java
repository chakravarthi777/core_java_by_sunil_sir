package Programming_on_Arrays;

public class AscendingSortWithoutTemp {
	public static void ascendingSort(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[j]-a[i];
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {8,2,3,1};
		ascendingSort(a);
	}

}
