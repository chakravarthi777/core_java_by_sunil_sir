package approach2_programming_readibility_v2;
import java.util.Scanner;
public class TrainMainClass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Destination Point : ");
		String s=sc.next();
		Train obj=new Train();
		obj.initialize(s);
		obj.display();
	}

}
