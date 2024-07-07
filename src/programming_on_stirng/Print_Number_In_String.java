package programming_on_stirng;
import java.util.Scanner;
public class Print_Number_In_String {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0 ;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				System.out.print(ch +" ");
		}
		
		System.out.println();
		for(int i=0 ;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
				System.out.print(ch+ " ");
		}
	}
}
