package approach2_programming_readability_v1;
import java.util.Scanner;
public class BalloonMainClass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter color :");
		String s=sc.next();
		
		Balloon b=new Balloon();
		b.giveColor(s);
		b.display();
		
	}

}
