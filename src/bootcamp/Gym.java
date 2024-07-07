package bootcamp;

import java.util.Scanner;

public class Gym {
	public static double bmi(int w,double h)
	{
		return w/(h*h);
	}
	public static String discount(int w,double h)
	{
		double bmi=bmi(w,h);
		if(bmi<18.5)
			return "underweight";
		else if(bmi>=18.5 && bmi<24.9)
			return "normalweight";
		else if(bmi>=25 && bmi<=29.9)
			return "overweight";
		else if(bmi>=30)
			return "obesity";
		return "Invalid";
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter values :");
		int w=sc.nextInt();
		double h=sc.nextDouble();
		double fee=sc.nextDouble();
		double dis;
		switch(discount(w,h))
		{
		case "underweight":	System.out.println("UnderWeight");
							System.out.println(bmi(w,h));
							System.out.println(fee-((fee*15)/100));
							break;
							
		case "normalweight":System.out.println("normalweight");
							System.out.println(bmi(w,h));
							System.out.println(fee-((fee*10)/100));
							break;
								
		case "overweight":	System.out.println("overweight");
							System.out.println(bmi(w,h));
							System.out.println(fee-((fee*5)/100));		
							break;
		case "obesity" :	System.out.println("obesity");
							System.out.println(bmi(w,h));
							System.out.println(fee);		
							break;
		}
	}

}
