package approach4_programming;

public class BookMainClass1 
{
	public static void usage(Book book)
	{
		book.display();
	}
 public static void main(String[] args)
 {
	usage(new Book("AninsideStory", "vasudev jagadish", 280, 14523,"self-help"));
	usage(new Book("Harrypotter", "jK Rowling", 280, 14523,"Marketing"));
 }
}
