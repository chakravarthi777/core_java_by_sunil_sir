package programming_on_stirng;

public class ReverseOddWordsInString 
{
	public static void reverseOddIndexWords(String s)
	{
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==1)
			{
				String s3=s1[i];
				for(int j=s3.length()-1;j>=0;j--)
				{
					System.out.print(s3.charAt(j));
				}
				System.out.print(" ");
			}
			else
				System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Hii How Are You";
		reverseOddIndexWords(s);
	}
}
