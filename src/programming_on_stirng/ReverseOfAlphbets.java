package programming_on_stirng;

import java.util.Scanner;

public class ReverseOfAlphbets {
	public static void reverseAlphabets(String s)
	{
		char[] a=s.toCharArray();
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
				s1+=a[i];
			}
		}
		//reverse
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		//printing rev and regular special characters.
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
				System.out.print(rev.charAt(index));
				index++;
			}
			else
			{
				System.out.print(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String s=sc.next();
		reverseAlphabets(s);
	}

}
