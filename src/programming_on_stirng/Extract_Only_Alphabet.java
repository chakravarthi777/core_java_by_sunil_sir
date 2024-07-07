package programming_on_stirng;

public class Extract_Only_Alphabet {
	
	public static void main(String[] ags)
	{
		String s="Jsp2024";	
		// normal way of finding alphabetic
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				System.out.print(ch+" ");
		}
		System.out.println(" ");
		FindCharacter(s);
	}
	// by using Character.isalphabetic method
	public static void FindCharacter(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
				System.out.print(ch+" ");
		}
	}
}
