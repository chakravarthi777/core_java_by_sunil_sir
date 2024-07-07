package bootcamp;

import java.util.Scanner;

public class Largest_Among_Four_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,n4;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		if(n1>n2 && n1>n3 && n1>n4)
			System.out.println(n1);
		else if(n2>n3 && n2>n4)
			System.out.println(n2);
		else if(n3>n4)
			System.out.println(n3);
		else 
			System.out.println(n4);

	}

}
