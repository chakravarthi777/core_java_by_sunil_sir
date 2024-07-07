package approach2_programming_readibility_v2;
import java.util.Scanner;
public class BalloonMainClass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter color :");
		String s=sc.next();
		
		Balloon baloon=new Balloon();
		baloon.initialize(s);
		baloon.display();
		
	}

}
