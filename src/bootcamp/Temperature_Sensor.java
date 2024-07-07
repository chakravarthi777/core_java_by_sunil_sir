package bootcamp;

import java.util.Scanner;

public class Temperature_Sensor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double cur_Temp=sc.nextDouble();
		double min_Temp=70, max_Temp=80;
	
		//convert current temperature celsius to fahrenheit
		// F = (9/5)C + 32
		cur_Temp=(cur_Temp*(9.0/5))+32;
		System.out.println(cur_Temp);
		if(cur_Temp>=min_Temp && cur_Temp<=max_Temp)
			System.out.println("Temperature is within the range");
		
		
	}

}
