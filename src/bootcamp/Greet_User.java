package bootcamp;

import java.util.Scanner;

public class Greet_User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time=sc.nextInt();
		if(time<0 || time>=25)
			System.out.println("Invalid Time");
		else if(time>=5 && time<=11)
			System.out.println("Good Morning");
		else if(time>=12 && time<=16)
			System.out.println("Good Afternoon");
		else if(time>=17 && time<=20)
			System.out.println("Good Evening");
		else if(time>=4 && time<=24 || time>=0 && time<=4)
			System.out.println("Good Night");
	}

}
