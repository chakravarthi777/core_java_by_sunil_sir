package approach3_programming;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private int price;
	private int id;
	private String bookGenre;
	private String fn,ln;
	//critical method
	public void BookDetails(String bookTitle,String bookAuthor,int price,int id,String bookGenre)
	{
		if(verifyBookTitle(bookTitle))
			this.bookTitle=bookTitle;
		else
			System.err.println(bookTitle+" is Invalid BookTitle");
		
		if(verifyBookAuthor(bookAuthor))
			this.bookAuthor=bookAuthor;
		else
			System.err.println(bookAuthor+" is Invalid BookAuthor");
		
		if(verifyBookPrice(price))
				this.price=price;
		else
			System.err.println(price+"is invalid bookPrice");
		
		if(verifyBookId(id))
			this.id=id;
		else
			System.err.println(id+" is invalid id");
		
		if(verifyBookGenre(bookGenre))
			this.bookGenre=bookGenre;
		else
			System.err.println(bookGenre+" is invalid BookGenre");
		
	}
	public void display()
	{
		System.out.println("BookTitle  : "+bookTitle);
		System.out.println("BookAuthor : "+bookAuthor);
		System.out.println("BookPrice  : "+price);
		System.out.println("BookId 	   : "+id);
		System.out.println("BookGenre  : "+bookGenre);
		
	}
	//non-critical Methods
	//BookTitle validation
	private boolean verifyBookTitle(String bookTitle)
	{
		int count=0;
		for(int i=0;i<bookTitle.length();i++)
		{
			char c=bookTitle.charAt(i);
			if(c>='A' && c<='Z' || c>='a'&& c<='z')
				count++;	
		}
		if(count==bookTitle.length())
			return true;
		
		return false;
	}
	//bookAuthorName validation
	private boolean verifyBookAuthor(String bookAuthor)
	{
		String fn="";
		String ln="";
		int count=0;
		//firstname
		loop1:
		for(int i=0;i<bookAuthor.length();i++)
		{
			char c=bookAuthor.charAt(i);
			if(c==' ')
				break loop1;
			else
			{
				fn+=c;
				count++;
			}
		}
		//last name
		for(int j=count+1;j<bookAuthor.length();j++)
		{
			ln+=bookAuthor.charAt(j);
			
		}
		//validation
		String name;
		if(fn.length()>=1 && ln.length()>=1 && 
				(fn.charAt(0)>='A'&& fn.charAt(0)<='Z' ||fn.charAt(0)>='a' && fn.charAt(0)<='z') 
				&& (fn.charAt(fn.length()-1)>='A' && fn.charAt(fn.length()-1)<='Z' || fn.charAt(fn.length()-1)>='a' && fn.charAt(fn.length()-1)<='z')
				&& (ln.charAt(0)>='A' && ln.charAt(0)<='Z' || ln.charAt(0)>='a' && ln.charAt(0)<='z')
				&& (ln.charAt(ln.length()-1)>='A' && ln.charAt(ln.length()-1)<='Z' || ln.charAt(ln.length()-1)>='a' && ln.charAt(ln.length()-1)<='z'))
		{
			return true;
		}
		
		return false;
		
	}
	private boolean verifyBookPrice(int price)
	{
		if(price>=250 && price<=2500)
			return true;
		
		return false;
	}
	private boolean verifyBookId(int id)
	{
		if(countDigit(id) && isPrime(id))
			return true;
		return false;
	}
	private boolean verifyBookGenre(String bookGenre)
	{
		if(bookGenre.equalsIgnoreCase("Biography") || bookGenre.equalsIgnoreCase("AutoBiography") || bookGenre.equalsIgnoreCase("Self Help")||bookGenre.equalsIgnoreCase("Self-Help")
				|| bookGenre.equalsIgnoreCase("Marketing") ||bookGenre.equalsIgnoreCase("Non Fiction")) 
		{
			return true;
		}
		return false;
	}
	// Additional methods for problem solving
	private static boolean isPrime(int id)
	{
		int t=id;
		int flag=1;
		int twoDigit=0;
		int rev=0;
		for(int j=1;j<=2;j++)
		{
			int d=t%10;
			twoDigit=twoDigit*10+d;
			t/=10;
		}
		
		while(twoDigit>0)
		{
			int d=twoDigit%10;
			rev=rev*10+d;
			twoDigit/=10;
		}	
		for(int i=2;i<rev;i++)
		{
			if(rev%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			return false;
	return true;
	}
	
	private boolean countDigit(int id)
	{
		int t=id;
		int count=0;
		while(t>0)
		{
			count++;
			t/=10;
		}
		if(count==5)
			return true;
		return false;
	}
}
