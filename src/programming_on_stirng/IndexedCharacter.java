package programming_on_stirng;
 import java.util.Scanner;

public class IndexedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int index=sc.nextInt();
		sc.close();
		if(index>0)
		System.out.println(s.charAt(index-1));
		else
			System.err.println("index must be greater than 0");
	}

}
