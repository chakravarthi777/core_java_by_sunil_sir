package bootcamp;

public class SumAndProductOfANumber {

	public static void main(String[] args) {
		int n=30123;
		int sum=0;
		int product=1;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			product*=d;
			n/=10;
		}
		System.out.println(sum);
		System.out.println(product);
	}

}
