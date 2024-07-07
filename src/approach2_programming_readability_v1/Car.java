package approach2_programming_readability_v1;

public class Car {

	private int speed;
	private double mileage;
	private int fuel;
	//initialize method
	public void initialize(int speed,double mileage,int fuel)
	{
		if(speed>=60 && speed<=150)
			this.speed=speed;
		else
			System.err.println("Invalid speed ");
		
		if(mileage>=12.6 && mileage<=26.8)
			this.mileage=mileage;
		else
			System.err.println("Invalid mileage...");
		
		if(fuel>=200 && fuel<=800)
			this.fuel=fuel;
		else
			System.err.println("Invalid fuel...");
	}
	public void display()
	{
		System.out.println("Car moves at the speed of "+speed+" KMPH");
		System.out.println("Car gives "+ mileage+" KMPL mileage");
		System.out.println("fuel capacity of car is "+ fuel);
	}
}
