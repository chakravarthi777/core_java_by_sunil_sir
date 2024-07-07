package approach2_programming_readibility_v2;

public class Car {

	private int speed;
	private double mileage;
	private int fuelTankCapacity;
	private String color;
	private String carNumber;
	//initialize method
	public void initialize(int speed,double mileage,int fuelTankCapacity,String color,String carNumber)
	{
		//speed validation
		if(validateSpeed(speed))
			this.speed=speed;
		else
			System.out.println("Invalid speed");
		//mileage check
		if(checkMileage(mileage)==1)
			this.mileage=mileage;
		else
			System.out.println("Invalid mileage");
		//verify fuelTankCapacity
		if(verifyFuelTankCapacity(fuelTankCapacity).equals("valid"))
			this.fuelTankCapacity=fuelTankCapacity;
		else
			System.out.println("Invalid fuelTankCapacity");
		//validatecolor method
		if(validateColor(color)=='p')
			this.color=color;
		else
			System.out.println("Invalid color");
		
		if(verifyCarNumber(carNumber)==1)
			this.carNumber=carNumber;
		else
			System.err.println("Invalid car number");
		
	}
	//private color
	private char validateColor(String color)
	{
		if(color.equals("WHITE") || color.equals("RED") ||color.equals("BLACK") )
			return 'p';
		else
			return 'f';
	}
	//private speed
	private boolean validateSpeed(int speed)
	{
		if(speed>=60 && speed<=150)
			return true;
		else
			return false;
	}
	//private mileage
	private int checkMileage(double mileage)
	{
		if(mileage>=12.6 && mileage<=26.8)
			return 1;
		else
			return 0;
	}
	//private fuelTankCapacity
	private String verifyFuelTankCapacity(int fuelTankCapacity)
	{
		if(fuelTankCapacity >=200 && fuelTankCapacity <=800)
			return "valid";
		else
			return "invalid";
	}
	//carNumber validation
	private int verifyCarNumber(String carNumber)
	{
		if(carNumber.length()==8 && Character.isAlphabetic(carNumber.charAt(0)) && Character.isAlphabetic(carNumber.charAt(1)))
			return 1;
		else
			return 0;
	}
	
	public void display()
	{
		System.out.println("Car moves at the speed of "+speed+" KMPH");
		System.out.println("Car gives "+ mileage+" KMPL mileage");
		System.out.println("fuel capacity of car is "+ fuelTankCapacity);
		System.out.println("Color of car is :"+color);
		System.out.println("Car number :"+carNumber);
	}
}
