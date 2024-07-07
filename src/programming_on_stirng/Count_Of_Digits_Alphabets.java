package programming_on_stirng;
import java.util.Scanner;
public class Count_Of_Digits_Alphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ac=0;
		int dc=0;
		int spc=0;
		for(int i=0 ;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
				dc++;
			else if(Character.isAlphabetic(ch))
				ac++;
			else
				spc++;
				
			
		}
		System.out.println("count of alphabets : "+ac);
		System.out.println("count of Digits : "+dc);
		System.out.println("count of specialcharacter: "+spc);
	}

}
