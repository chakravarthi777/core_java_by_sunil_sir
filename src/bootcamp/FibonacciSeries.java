package bootcamp;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(sum);
			a=b;
			b=sum;
			sum=a+b;
		}

	}

}
