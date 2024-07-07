package programming_on_stirng;

import java.util.Iterator;

public class RemoveColonInString {
	//Logic 1
	public static String removeColonInString(String s)
	{
		String res="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=':')
			{
				res+=s.charAt(i);
			}
		}
		return res;
	}
	//Logic 2 ----> by sir
	public static String removeDoubleColon(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				res+=s.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="J::S::P::A";
		System.out.println(removeColonInString(s));
		System.out.println(removeDoubleColon(s));
	}

}
