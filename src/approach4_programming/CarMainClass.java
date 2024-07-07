package approach4_programming;

public class CarMainClass {
	public static void usage(Car car)
	{
		car.display();
	}
	public static void main(String[] args) 
	{
		usage(new Car(65,12.6,400,"WHITE","Ap123456"));
		System.out.println();
		usage(new Car(120,25.6,500,"BLACK","Ts456789"));
		System.out.println();
		usage(new Car(150,25.6,500,"RED","KA778061"));
	}

}
